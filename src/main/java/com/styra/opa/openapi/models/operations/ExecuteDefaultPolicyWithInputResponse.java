/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.styra.opa.openapi.models.shared.Result;
import com.styra.opa.openapi.utils.Response;
import com.styra.opa.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class ExecuteDefaultPolicyWithInputResponse implements Response {

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
     * Success.
     * Evaluating the default policy has the same response behavior as a successful policy evaluation, but with only the result as the response.
     * 
     */
    private Optional<? extends Result> result;

    private Map<String, List<String>> headers;

    @JsonCreator
    public ExecuteDefaultPolicyWithInputResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends Result> result,
            Map<String, List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(result, "result");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.result = result;
        this.headers = headers;
    }
    
    public ExecuteDefaultPolicyWithInputResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Map<String, List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), headers);
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
     * Success.
     * Evaluating the default policy has the same response behavior as a successful policy evaluation, but with only the result as the response.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Result> result() {
        return (Optional<Result>) result;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ExecuteDefaultPolicyWithInputResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ExecuteDefaultPolicyWithInputResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ExecuteDefaultPolicyWithInputResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success.
     * Evaluating the default policy has the same response behavior as a successful policy evaluation, but with only the result as the response.
     * 
     */
    public ExecuteDefaultPolicyWithInputResponse withResult(Result result) {
        Utils.checkNotNull(result, "result");
        this.result = Optional.ofNullable(result);
        return this;
    }

    /**
     * Success.
     * Evaluating the default policy has the same response behavior as a successful policy evaluation, but with only the result as the response.
     * 
     */
    public ExecuteDefaultPolicyWithInputResponse withResult(Optional<? extends Result> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
        return this;
    }

    public ExecuteDefaultPolicyWithInputResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
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
        ExecuteDefaultPolicyWithInputResponse other = (ExecuteDefaultPolicyWithInputResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.result, other.result) &&
            Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            result,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecuteDefaultPolicyWithInputResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "result", result,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends Result> result = Optional.empty();
 
        private Map<String, List<String>> headers;  
        
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
         * Success.
         * Evaluating the default policy has the same response behavior as a successful policy evaluation, but with only the result as the response.
         * 
         */
        public Builder result(Result result) {
            Utils.checkNotNull(result, "result");
            this.result = Optional.ofNullable(result);
            return this;
        }

        /**
         * Success.
         * Evaluating the default policy has the same response behavior as a successful policy evaluation, but with only the result as the response.
         * 
         */
        public Builder result(Optional<? extends Result> result) {
            Utils.checkNotNull(result, "result");
            this.result = result;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public ExecuteDefaultPolicyWithInputResponse build() {
            return new ExecuteDefaultPolicyWithInputResponse(
                contentType,
                statusCode,
                rawResponse,
                result,
                headers);
        }
    }
}

