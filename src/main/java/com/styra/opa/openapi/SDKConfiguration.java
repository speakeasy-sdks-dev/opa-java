/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.openapi;

import com.styra.opa.openapi.utils.Hook.SdkInitData;
import com.styra.opa.openapi.utils.HTTPClient;
import com.styra.opa.openapi.utils.RetryConfig;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "0.2.0";
    public String sdkVersion = "0.6.13";
    public String genVersion = "2.319.10";
    public String userAgent = "speakeasy-sdk/java 0.6.13 2.319.10 0.2.0 com.styra.opa.openapi";

    private com.styra.opa.openapi.utils.Hooks _hooks = new com.styra.opa.openapi.utils.Hooks();

    public com.styra.opa.openapi.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(com.styra.opa.openapi.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        com.styra.opa.openapi.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
