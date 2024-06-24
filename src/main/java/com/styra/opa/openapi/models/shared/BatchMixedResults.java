/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class BatchMixedResults {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_decision_id")
    private Optional<? extends String> batchDecisionId;

    /**
     * If query metrics are enabled, this field contains query performance metrics collected during the parse, compile, and evaluation steps.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metrics")
    private Optional<? extends java.util.Map<String, java.lang.Object>> metrics;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("responses")
    private Optional<? extends java.util.Map<String, Responses>> responses;

    @JsonCreator
    public BatchMixedResults(
            @JsonProperty("batch_decision_id") Optional<? extends String> batchDecisionId,
            @JsonProperty("metrics") Optional<? extends java.util.Map<String, java.lang.Object>> metrics,
            @JsonProperty("responses") Optional<? extends java.util.Map<String, Responses>> responses) {
        Utils.checkNotNull(batchDecisionId, "batchDecisionId");
        Utils.checkNotNull(metrics, "metrics");
        Utils.checkNotNull(responses, "responses");
        this.batchDecisionId = batchDecisionId;
        this.metrics = metrics;
        this.responses = responses;
    }
    
    public BatchMixedResults() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> batchDecisionId() {
        return (Optional<String>) batchDecisionId;
    }

    /**
     * If query metrics are enabled, this field contains query performance metrics collected during the parse, compile, and evaluation steps.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.lang.Object>> metrics() {
        return (Optional<java.util.Map<String, java.lang.Object>>) metrics;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, Responses>> responses() {
        return (Optional<java.util.Map<String, Responses>>) responses;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BatchMixedResults withBatchDecisionId(String batchDecisionId) {
        Utils.checkNotNull(batchDecisionId, "batchDecisionId");
        this.batchDecisionId = Optional.ofNullable(batchDecisionId);
        return this;
    }

    public BatchMixedResults withBatchDecisionId(Optional<? extends String> batchDecisionId) {
        Utils.checkNotNull(batchDecisionId, "batchDecisionId");
        this.batchDecisionId = batchDecisionId;
        return this;
    }

    /**
     * If query metrics are enabled, this field contains query performance metrics collected during the parse, compile, and evaluation steps.
     */
    public BatchMixedResults withMetrics(java.util.Map<String, java.lang.Object> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = Optional.ofNullable(metrics);
        return this;
    }

    /**
     * If query metrics are enabled, this field contains query performance metrics collected during the parse, compile, and evaluation steps.
     */
    public BatchMixedResults withMetrics(Optional<? extends java.util.Map<String, java.lang.Object>> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = metrics;
        return this;
    }

    public BatchMixedResults withResponses(java.util.Map<String, Responses> responses) {
        Utils.checkNotNull(responses, "responses");
        this.responses = Optional.ofNullable(responses);
        return this;
    }

    public BatchMixedResults withResponses(Optional<? extends java.util.Map<String, Responses>> responses) {
        Utils.checkNotNull(responses, "responses");
        this.responses = responses;
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
        BatchMixedResults other = (BatchMixedResults) o;
        return 
            java.util.Objects.deepEquals(this.batchDecisionId, other.batchDecisionId) &&
            java.util.Objects.deepEquals(this.metrics, other.metrics) &&
            java.util.Objects.deepEquals(this.responses, other.responses);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            batchDecisionId,
            metrics,
            responses);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BatchMixedResults.class,
                "batchDecisionId", batchDecisionId,
                "metrics", metrics,
                "responses", responses);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> batchDecisionId = Optional.empty();
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> metrics = Optional.empty();
 
        private Optional<? extends java.util.Map<String, Responses>> responses = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder batchDecisionId(String batchDecisionId) {
            Utils.checkNotNull(batchDecisionId, "batchDecisionId");
            this.batchDecisionId = Optional.ofNullable(batchDecisionId);
            return this;
        }

        public Builder batchDecisionId(Optional<? extends String> batchDecisionId) {
            Utils.checkNotNull(batchDecisionId, "batchDecisionId");
            this.batchDecisionId = batchDecisionId;
            return this;
        }

        /**
         * If query metrics are enabled, this field contains query performance metrics collected during the parse, compile, and evaluation steps.
         */
        public Builder metrics(java.util.Map<String, java.lang.Object> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = Optional.ofNullable(metrics);
            return this;
        }

        /**
         * If query metrics are enabled, this field contains query performance metrics collected during the parse, compile, and evaluation steps.
         */
        public Builder metrics(Optional<? extends java.util.Map<String, java.lang.Object>> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = metrics;
            return this;
        }

        public Builder responses(java.util.Map<String, Responses> responses) {
            Utils.checkNotNull(responses, "responses");
            this.responses = Optional.ofNullable(responses);
            return this;
        }

        public Builder responses(Optional<? extends java.util.Map<String, Responses>> responses) {
            Utils.checkNotNull(responses, "responses");
            this.responses = responses;
            return this;
        }
        
        public BatchMixedResults build() {
            return new BatchMixedResults(
                batchDecisionId,
                metrics,
                responses);
        }
    }
}

