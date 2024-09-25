/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;

import com.styra.opa.openapi.models.shared.GzipAcceptEncoding;
import com.styra.opa.openapi.models.shared.Input;
import com.styra.opa.openapi.utils.Utils;
import java.lang.Boolean;
import java.util.Optional;

public class ExecuteDefaultPolicyWithInputRequestBuilder {

    private Optional<Boolean> pretty = Optional.empty();
    private Optional<? extends GzipAcceptEncoding> acceptEncoding = Optional.empty();
    private Input input;
    private final SDKMethodInterfaces.MethodCallExecuteDefaultPolicyWithInput sdk;

    public ExecuteDefaultPolicyWithInputRequestBuilder(SDKMethodInterfaces.MethodCallExecuteDefaultPolicyWithInput sdk) {
        this.sdk = sdk;
    }
                
    public ExecuteDefaultPolicyWithInputRequestBuilder pretty(boolean pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = Optional.of(pretty);
        return this;
    }

    public ExecuteDefaultPolicyWithInputRequestBuilder pretty(Optional<Boolean> pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = pretty;
        return this;
    }
                
    public ExecuteDefaultPolicyWithInputRequestBuilder acceptEncoding(GzipAcceptEncoding acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = Optional.of(acceptEncoding);
        return this;
    }

    public ExecuteDefaultPolicyWithInputRequestBuilder acceptEncoding(Optional<? extends GzipAcceptEncoding> acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = acceptEncoding;
        return this;
    }

    public ExecuteDefaultPolicyWithInputRequestBuilder input(Input input) {
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
