# OPA Java SDK

This repository contains a Java SDK for a Java SDK for the [Open Policy Agent](https://www.openpolicyagent.org/) [REST API](https://www.openpolicyagent.org/docs/latest/rest-api/). It includes components generated by [Speakeasy](https://www.speakeasyapi.dev/) based on [this OpenAPI spec](https://github.com/StyraInc/enterprise-opa/tree/main/openapi), as well as human authored code that simplifies usage. The Speakeasy generated code resides in the [com.styra.opa.sdk](https://styrainc.github.io/opa-java/javadoc/com/styra/opa/sdk/package-summary.html) package and offers the greatest level of control, but is more verbose and complicated. The hand written [com.styra.opa](https://styrainc.github.io/opa-java/javadoc/com/styra/opa/package-summary.html) package offers a simplified API designed to make using the OPA REST API straightforward for common use cases.

## Build Instructions

**To build the SDK**, use `./gradlew build`, the resulting JAR will be placed in `./build/libs/api.jar`.

**To build the documentation** site, including JavaDoc, run `./scripts/build_docs.sh OUTPUT_DIR`. You should replace `OUTPUT_DIR` with a directory on your local system where you would like the generated docs to be placed. You can also preview the documentation site ephemerally using `./scripts/serve_docs.sh`, which will serve the docs on `http://localhost:8000` until you use Ctrl+C to exit the script.

**To run the unit tests**, you can use `./gradlew test`.

**To run the linter**, you can use `./gradlew lint`

## Usage Example

Start with a fresh Gradle project created according to [this guide](https://docs.gradle.org/current/userguide/part1_gradle_init.html#part1_begin).

**TODO**: once publishing releases to Maven Central is working, show how to use the Maven package as a dependency instead.

Create `./libs/` and place the `api.jar` from the *Build Instructions* section at `./libs/api.jar`.

Add to your `build.gradle` file, under the `dependencies` section `implementation files("${project.rootDir}/libs/api.jar")`. Because adding `opa-java` in this way does not properly inform Gradle of its transitive decencies, you must also add all of the `implementation` lines from `opa-java`'s [`./build.gradle`](./build.gradle). This step won't be needed once the Maven package is working. As an example, your `dependencies` section should look similar to the following:

```plain
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.16.2'
    implementation 'com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.16.2'
    implementation 'com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.16.2'
    implementation 'org.openapitools:jackson-databind-nullable:0.2.6'
    implementation 'org.apache.httpcomponents:httpclient:4.5.14'
    implementation 'org.apache.httpcomponents:httpmime:4.5.14'
    implementation 'commons-io:commons-io:2.15.1'

    implementation 'com.fasterxml.jackson.core:jackson-annotations:2.16.2'
    implementation 'com.fasterxml.jackson.core:jackson-core:2.16.2'
    implementation 'org.apache.httpcomponents:httpcore:4.4.16'

    implementation files("${project.rootDir}/libs/api.jar")
```

Now we can update `app/src/main/java/org/example/App.java` to call the OPA API. The following Java code is an example of the `App.java` generated by `gradle init`, modified to make some calls to OPA.

```java
package org.example;

import com.styra.opa.OPAClient;
import com.styra.opa.OPAException;

import java.util.Map;
import java.util.List;

import static java.util.Map.entry;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        // Create an OPA instance, this handles any state needed for inteacting
        // with OPA, and can be re-used for multiple requests if needed.
        String opaURL = "http://localhost:8181";
        OPAClient opa = new OPAClient(opaURL);

        // This will be the input to our policy.
        java.util.Map<String,Object> input = java.util.Map.ofEntries(
            entry("subject", "alice"),
            entry("action", "read"),
            entry("resource", "/finance/reports/fy2038_budget.csv")
        );
        System.out.println("input for OPA request is: " + input);

        // We will read the list of policy violations, and whether the request
        // is allowed or not into these.
        java.util.List<Object> violations;
        boolean allowed;

        // Perform the request against OPA.
        try {
            allowed = opa.check("policy/allow", input);
            violations = opa.evaluate("policy/violations", input);
        } catch (OPAException e ) {
            // Note that OPAException usually wraps other exception types, in
            // case you need to do more complex error handling.
            System.out.println("exception while making request against OPA: " + e);
            throw e; // crash the program
        }

        System.out.println("allowed: " + allowed);
        System.out.println("violations: " + violations);
    }
}
```

Before we can run this program, we also need a policy, and an OPA instance running. Create the file `main.rego` with these contents:

```rego
package policy

import rego.v1

groups := {
    "accounting": {
        "members": [
            "alice", "bob",
        ]
    },
    "it": {
        "members": ["eve"]
    }
}

subject := object.get(input, "subject", "")

groups_for_subject contains group if {
    groups[group].members[_] == subject
}

violations contains violation if {
    count(groups_for_subject) == 0
    violation := sprintf("subject '%s' is not associated with any groups", [subject])
}

violations contains violation if {
    startswith(input.resource, "/finance")
    not "accounting" in groups_for_subject
    violation := sprintf("subject '%s' s not in the accounting group", [subject])
}

default allow = false

allow = true if {
    count(violations) == 0
}
```

Now run `opa run -s main.rego`. Leave this command running while you run your Java program.

Finally, we can run the program with `./gradlew run` and see it communicating with the Rego policy:

```plain
$ ./gradlew run

> Task :app:run
Hello World!
input for OPA request is: {subject=alice, resource=/finance/reports/fy2038_budget.csv, action=read}
allowed: true
violations: []

BUILD SUCCESSFUL in 1s
2 actionable tasks: 1 executed, 1 up-to-date
```

Try changing the policy input in `App.java`, or modifying the `main.rego` to observe how the behavior will change. Remember that you will need to restart `opa` any time you edit `main.rego`.

## License

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)



> [!NOTE]
> For low-level SDK usage, see the sections below.

---

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.styra.opa.openapi:api:0.6.14'
```

Maven:
```xml
<dependency>
    <groupId>com.styra.opa.openapi</groupId>
    <artifactId>api</artifactId>
    <version>0.6.14</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.styra.opa.openapi.OpaApiClient;
import com.styra.opa.openapi.models.operations.*;
import com.styra.opa.openapi.models.operations.ExecutePolicyWithInputResponse;
import com.styra.opa.openapi.models.shared.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            OpaApiClient sdk = OpaApiClient.builder()
                .build();

            ExecutePolicyWithInputRequest req = ExecutePolicyWithInputRequest.builder()
                .path("app/rbac")
                .requestBody(ExecutePolicyWithInputRequestBody.builder()
                        .input(Input.of(false))
                        .build())
                .build();

            ExecutePolicyWithInputResponse res = sdk.executePolicyWithInput()
                .request(req)
                .call();

            if (res.successfulPolicyEvaluation().isPresent()) {
                // handle response
            }
        } catch (com.styra.opa.openapi.models.errors.ClientError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.ServerError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [OpaApiClient SDK](docs/sdks/opaapiclient/README.md)

* [executePolicy](docs/sdks/opaapiclient/README.md#executepolicy) - Execute a policy
* [executePolicyWithInput](docs/sdks/opaapiclient/README.md#executepolicywithinput) - Execute a policy given an input
* [health](docs/sdks/opaapiclient/README.md#health) - Verify the server is operational
<!-- End Available Resources and Operations [operations] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:8181` | None |

#### Example

```java
package hello.world;

import com.styra.opa.openapi.OpaApiClient;
import com.styra.opa.openapi.models.operations.*;
import com.styra.opa.openapi.models.operations.ExecutePolicyResponse;
import com.styra.opa.openapi.models.shared.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            OpaApiClient sdk = OpaApiClient.builder()
                .serverIndex(0)
                .build();

            ExecutePolicyRequest req = ExecutePolicyRequest.builder()
                .path("app/rbac")
                .build();

            ExecutePolicyResponse res = sdk.executePolicy()
                .request(req)
                .call();

            if (res.successfulPolicyEvaluation().isPresent()) {
                // handle response
            }
        } catch (com.styra.opa.openapi.models.errors.ClientError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.ServerError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.styra.opa.openapi.OpaApiClient;
import com.styra.opa.openapi.models.operations.*;
import com.styra.opa.openapi.models.operations.ExecutePolicyResponse;
import com.styra.opa.openapi.models.shared.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            OpaApiClient sdk = OpaApiClient.builder()
                .serverURL("http://localhost:8181")
                .build();

            ExecutePolicyRequest req = ExecutePolicyRequest.builder()
                .path("app/rbac")
                .build();

            ExecutePolicyResponse res = sdk.executePolicy()
                .request(req)
                .call();

            if (res.successfulPolicyEvaluation().isPresent()) {
                // handle response
            }
        } catch (com.styra.opa.openapi.models.errors.ClientError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.ServerError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object              | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 400                       | application/json          |
| models/errors/ServerError | 500                       | application/json          |
| models/errors/SDKError    | 4xx-5xx                   | */*                       |

### Example

```java
package hello.world;

import com.styra.opa.openapi.OpaApiClient;
import com.styra.opa.openapi.models.operations.*;
import com.styra.opa.openapi.models.operations.ExecutePolicyResponse;
import com.styra.opa.openapi.models.shared.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            OpaApiClient sdk = OpaApiClient.builder()
                .build();

            ExecutePolicyRequest req = ExecutePolicyRequest.builder()
                .path("app/rbac")
                .build();

            ExecutePolicyResponse res = sdk.executePolicy()
                .request(req)
                .call();

            if (res.successfulPolicyEvaluation().isPresent()) {
                // handle response
            }
        } catch (com.styra.opa.openapi.models.errors.ClientError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.ServerError e) {
            // handle exception
        } catch (com.styra.opa.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
