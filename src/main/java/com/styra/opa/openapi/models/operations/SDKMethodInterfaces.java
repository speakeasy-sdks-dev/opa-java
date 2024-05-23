/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallExecuteDefaultPolicyWithInput {
        com.styra.opa.openapi.models.operations.ExecuteDefaultPolicyWithInputResponse executeDefaultPolicyWithInput(
            Optional<? extends Boolean> pretty,
            Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding,
            com.styra.opa.openapi.models.shared.Input input) throws Exception;
    }


    public interface MethodCallExecutePolicy {
        com.styra.opa.openapi.models.operations.ExecutePolicyResponse executePolicy(
            com.styra.opa.openapi.models.operations.ExecutePolicyRequest request) throws Exception;
    }


    public interface MethodCallExecutePolicyWithInput {
        com.styra.opa.openapi.models.operations.ExecutePolicyWithInputResponse executePolicyWithInput(
            com.styra.opa.openapi.models.operations.ExecutePolicyWithInputRequest request) throws Exception;
    }


    public interface MethodCallHealth {
        com.styra.opa.openapi.models.operations.HealthResponse health(
            Optional<? extends Boolean> bundles,
            Optional<? extends Boolean> plugins,
            Optional<? extends java.util.List<String>> excludePlugin) throws Exception;
    }

}
