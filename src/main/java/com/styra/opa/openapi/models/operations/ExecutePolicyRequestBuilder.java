/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;

import com.styra.opa.openapi.utils.Utils;

public class ExecutePolicyRequestBuilder {

    private ExecutePolicyRequest request;
    private final SDKMethodInterfaces.MethodCallExecutePolicy sdk;

    public ExecutePolicyRequestBuilder(SDKMethodInterfaces.MethodCallExecutePolicy sdk) {
        this.sdk = sdk;
    }

    public ExecutePolicyRequestBuilder request(ExecutePolicyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ExecutePolicyResponse call() throws Exception {

        return sdk.executePolicy(
            request);
    }
}
