/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class ExecuteBatchPolicyWithInputResponse implements com.styra.opa.openapi.utils.Response {

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
     * All batched policy executions succeeded.
     * The server also returns 200 if the path refers to an undefined document. In this case, responses will be empty.
     * 
     */
    private Optional<? extends com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation> batchSuccessfulPolicyEvaluation;

    /**
     * Mixed success and failures.
     */
    private Optional<? extends com.styra.opa.openapi.models.shared.BatchMixedResults> batchMixedResults;

    private java.util.Map<String, java.util.List<String>> headers;

    @JsonCreator
    public ExecuteBatchPolicyWithInputResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation> batchSuccessfulPolicyEvaluation,
            Optional<? extends com.styra.opa.openapi.models.shared.BatchMixedResults> batchMixedResults,
            java.util.Map<String, java.util.List<String>> headers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(batchSuccessfulPolicyEvaluation, "batchSuccessfulPolicyEvaluation");
        Utils.checkNotNull(batchMixedResults, "batchMixedResults");
        headers = Utils.emptyMapIfNull(headers);
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.batchSuccessfulPolicyEvaluation = batchSuccessfulPolicyEvaluation;
        this.batchMixedResults = batchMixedResults;
        this.headers = headers;
    }
    
    public ExecuteBatchPolicyWithInputResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            java.util.Map<String, java.util.List<String>> headers) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty(), headers);
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
     * All batched policy executions succeeded.
     * The server also returns 200 if the path refers to an undefined document. In this case, responses will be empty.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation> batchSuccessfulPolicyEvaluation() {
        return (Optional<com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation>) batchSuccessfulPolicyEvaluation;
    }

    /**
     * Mixed success and failures.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.styra.opa.openapi.models.shared.BatchMixedResults> batchMixedResults() {
        return (Optional<com.styra.opa.openapi.models.shared.BatchMixedResults>) batchMixedResults;
    }

    @JsonIgnore
    public java.util.Map<String, java.util.List<String>> headers() {
        return headers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ExecuteBatchPolicyWithInputResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ExecuteBatchPolicyWithInputResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ExecuteBatchPolicyWithInputResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * All batched policy executions succeeded.
     * The server also returns 200 if the path refers to an undefined document. In this case, responses will be empty.
     * 
     */
    public ExecuteBatchPolicyWithInputResponse withBatchSuccessfulPolicyEvaluation(com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation batchSuccessfulPolicyEvaluation) {
        Utils.checkNotNull(batchSuccessfulPolicyEvaluation, "batchSuccessfulPolicyEvaluation");
        this.batchSuccessfulPolicyEvaluation = Optional.ofNullable(batchSuccessfulPolicyEvaluation);
        return this;
    }

    /**
     * All batched policy executions succeeded.
     * The server also returns 200 if the path refers to an undefined document. In this case, responses will be empty.
     * 
     */
    public ExecuteBatchPolicyWithInputResponse withBatchSuccessfulPolicyEvaluation(Optional<? extends com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation> batchSuccessfulPolicyEvaluation) {
        Utils.checkNotNull(batchSuccessfulPolicyEvaluation, "batchSuccessfulPolicyEvaluation");
        this.batchSuccessfulPolicyEvaluation = batchSuccessfulPolicyEvaluation;
        return this;
    }

    /**
     * Mixed success and failures.
     */
    public ExecuteBatchPolicyWithInputResponse withBatchMixedResults(com.styra.opa.openapi.models.shared.BatchMixedResults batchMixedResults) {
        Utils.checkNotNull(batchMixedResults, "batchMixedResults");
        this.batchMixedResults = Optional.ofNullable(batchMixedResults);
        return this;
    }

    /**
     * Mixed success and failures.
     */
    public ExecuteBatchPolicyWithInputResponse withBatchMixedResults(Optional<? extends com.styra.opa.openapi.models.shared.BatchMixedResults> batchMixedResults) {
        Utils.checkNotNull(batchMixedResults, "batchMixedResults");
        this.batchMixedResults = batchMixedResults;
        return this;
    }

    public ExecuteBatchPolicyWithInputResponse withHeaders(java.util.Map<String, java.util.List<String>> headers) {
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
        ExecuteBatchPolicyWithInputResponse other = (ExecuteBatchPolicyWithInputResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.batchSuccessfulPolicyEvaluation, other.batchSuccessfulPolicyEvaluation) &&
            java.util.Objects.deepEquals(this.batchMixedResults, other.batchMixedResults) &&
            java.util.Objects.deepEquals(this.headers, other.headers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            batchSuccessfulPolicyEvaluation,
            batchMixedResults,
            headers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecuteBatchPolicyWithInputResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "batchSuccessfulPolicyEvaluation", batchSuccessfulPolicyEvaluation,
                "batchMixedResults", batchMixedResults,
                "headers", headers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation> batchSuccessfulPolicyEvaluation = Optional.empty();
 
        private Optional<? extends com.styra.opa.openapi.models.shared.BatchMixedResults> batchMixedResults = Optional.empty();
 
        private java.util.Map<String, java.util.List<String>> headers;  
        
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
         * All batched policy executions succeeded.
         * The server also returns 200 if the path refers to an undefined document. In this case, responses will be empty.
         * 
         */
        public Builder batchSuccessfulPolicyEvaluation(com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation batchSuccessfulPolicyEvaluation) {
            Utils.checkNotNull(batchSuccessfulPolicyEvaluation, "batchSuccessfulPolicyEvaluation");
            this.batchSuccessfulPolicyEvaluation = Optional.ofNullable(batchSuccessfulPolicyEvaluation);
            return this;
        }

        /**
         * All batched policy executions succeeded.
         * The server also returns 200 if the path refers to an undefined document. In this case, responses will be empty.
         * 
         */
        public Builder batchSuccessfulPolicyEvaluation(Optional<? extends com.styra.opa.openapi.models.shared.BatchSuccessfulPolicyEvaluation> batchSuccessfulPolicyEvaluation) {
            Utils.checkNotNull(batchSuccessfulPolicyEvaluation, "batchSuccessfulPolicyEvaluation");
            this.batchSuccessfulPolicyEvaluation = batchSuccessfulPolicyEvaluation;
            return this;
        }

        /**
         * Mixed success and failures.
         */
        public Builder batchMixedResults(com.styra.opa.openapi.models.shared.BatchMixedResults batchMixedResults) {
            Utils.checkNotNull(batchMixedResults, "batchMixedResults");
            this.batchMixedResults = Optional.ofNullable(batchMixedResults);
            return this;
        }

        /**
         * Mixed success and failures.
         */
        public Builder batchMixedResults(Optional<? extends com.styra.opa.openapi.models.shared.BatchMixedResults> batchMixedResults) {
            Utils.checkNotNull(batchMixedResults, "batchMixedResults");
            this.batchMixedResults = batchMixedResults;
            return this;
        }

        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
            return this;
        }
        
        public ExecuteBatchPolicyWithInputResponse build() {
            return new ExecuteBatchPolicyWithInputResponse(
                contentType,
                statusCode,
                rawResponse,
                batchSuccessfulPolicyEvaluation,
                batchMixedResults,
                headers);
        }
    }
}

