/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class HealthResponse implements com.styra.opa.openapi.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
     */
    private Optional<? extends com.styra.opa.openapi.models.shared.HealthyServer> healthyServer;

    @JsonCreator
    public HealthResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.styra.opa.openapi.models.shared.HealthyServer> healthyServer) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(healthyServer, "healthyServer");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.healthyServer = healthyServer;
    }
    
    public HealthResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.styra.opa.openapi.models.shared.HealthyServer> healthyServer() {
        return (Optional<com.styra.opa.openapi.models.shared.HealthyServer>) healthyServer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public HealthResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HealthResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HealthResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
     */
    public HealthResponse withHealthyServer(com.styra.opa.openapi.models.shared.HealthyServer healthyServer) {
        Utils.checkNotNull(healthyServer, "healthyServer");
        this.healthyServer = Optional.ofNullable(healthyServer);
        return this;
    }

    /**
     * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
     */
    public HealthResponse withHealthyServer(Optional<? extends com.styra.opa.openapi.models.shared.HealthyServer> healthyServer) {
        Utils.checkNotNull(healthyServer, "healthyServer");
        this.healthyServer = healthyServer;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthResponse other = (HealthResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.healthyServer, other.healthyServer);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            healthyServer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HealthResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "healthyServer", healthyServer);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.styra.opa.openapi.models.shared.HealthyServer> healthyServer = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
         */
        public Builder healthyServer(com.styra.opa.openapi.models.shared.HealthyServer healthyServer) {
            Utils.checkNotNull(healthyServer, "healthyServer");
            this.healthyServer = Optional.ofNullable(healthyServer);
            return this;
        }

        /**
         * OPA service is healthy. If the bundles option is specified then all configured bundles have been activated. If the plugins option is specified then all plugins are in an OK state.
         */
        public Builder healthyServer(Optional<? extends com.styra.opa.openapi.models.shared.HealthyServer> healthyServer) {
            Utils.checkNotNull(healthyServer, "healthyServer");
            this.healthyServer = healthyServer;
            return this;
        }
        
        public HealthResponse build() {
            return new HealthResponse(
                contentType,
                statusCode,
                rawResponse,
                healthyServer);
        }
    }
}

