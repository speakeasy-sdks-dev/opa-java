/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.openapi.models.errors.SDKError;
import com.styra.opa.openapi.utils.LazySingletonValue;
import com.styra.opa.openapi.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class ExecuteDefaultPolicyWithInputRequestBuilder {

    private Optional<? extends Boolean> pretty = Optional.empty();
    private Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding = Optional.empty();
    private com.styra.opa.openapi.models.shared.Input input;
    private final SDKMethodInterfaces.MethodCallExecuteDefaultPolicyWithInput sdk;

    public ExecuteDefaultPolicyWithInputRequestBuilder(SDKMethodInterfaces.MethodCallExecuteDefaultPolicyWithInput sdk) {
        this.sdk = sdk;
    }
                
    public ExecuteDefaultPolicyWithInputRequestBuilder pretty(boolean pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = Optional.of(pretty);
        return this;
    }

    public ExecuteDefaultPolicyWithInputRequestBuilder pretty(Optional<? extends Boolean> pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = pretty;
        return this;
    }
                
    public ExecuteDefaultPolicyWithInputRequestBuilder acceptEncoding(com.styra.opa.openapi.models.shared.GzipAcceptEncoding acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = Optional.of(acceptEncoding);
        return this;
    }

    public ExecuteDefaultPolicyWithInputRequestBuilder acceptEncoding(Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = acceptEncoding;
        return this;
    }

    public ExecuteDefaultPolicyWithInputRequestBuilder input(com.styra.opa.openapi.models.shared.Input input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    public ExecuteDefaultPolicyWithInputResponse call() throws Exception {

        return sdk.executeDefaultPolicyWithInput(
            pretty,
            acceptEncoding,
            input);
    }
}
