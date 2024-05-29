/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.openapi.utils.LazySingletonValue;
import com.styra.opa.openapi.utils.SpeakeasyMetadata;
import com.styra.opa.openapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ExecutePolicyWithInputRequest {

    /**
     * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=path")
    private String path;

    /**
     * Indicates that the request body is gzip encoded
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Content-Encoding")
    private Optional<? extends com.styra.opa.openapi.models.shared.GzipContentEncoding> contentEncoding;

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Accept-Encoding")
    private Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding;

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pretty")
    private Optional<? extends Boolean> pretty;

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=provenance")
    private Optional<? extends Boolean> provenance;

    /**
     * Return query explanation in addition to result.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=explain")
    private Optional<? extends com.styra.opa.openapi.models.shared.Explain> explain;

    /**
     * Return query performance metrics in addition to result.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=metrics")
    private Optional<? extends Boolean> metrics;

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=instrument")
    private Optional<? extends Boolean> instrument;

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=strict-builtin-errors")
    private Optional<? extends Boolean> strictBuiltinErrors;

    /**
     * The input document
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private ExecutePolicyWithInputRequestBody requestBody;

    @JsonCreator
    public ExecutePolicyWithInputRequest(
            String path,
            Optional<? extends com.styra.opa.openapi.models.shared.GzipContentEncoding> contentEncoding,
            Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding,
            Optional<? extends Boolean> pretty,
            Optional<? extends Boolean> provenance,
            Optional<? extends com.styra.opa.openapi.models.shared.Explain> explain,
            Optional<? extends Boolean> metrics,
            Optional<? extends Boolean> instrument,
            Optional<? extends Boolean> strictBuiltinErrors,
            ExecutePolicyWithInputRequestBody requestBody) {
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(contentEncoding, "contentEncoding");
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        Utils.checkNotNull(pretty, "pretty");
        Utils.checkNotNull(provenance, "provenance");
        Utils.checkNotNull(explain, "explain");
        Utils.checkNotNull(metrics, "metrics");
        Utils.checkNotNull(instrument, "instrument");
        Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
        Utils.checkNotNull(requestBody, "requestBody");
        this.path = path;
        this.contentEncoding = contentEncoding;
        this.acceptEncoding = acceptEncoding;
        this.pretty = pretty;
        this.provenance = provenance;
        this.explain = explain;
        this.metrics = metrics;
        this.instrument = instrument;
        this.strictBuiltinErrors = strictBuiltinErrors;
        this.requestBody = requestBody;
    }
    
    public ExecutePolicyWithInputRequest(
            String path,
            ExecutePolicyWithInputRequestBody requestBody) {
        this(path, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), requestBody);
    }

    /**
     * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
     */
    @JsonIgnore
    public String path() {
        return path;
    }

    /**
     * Indicates that the request body is gzip encoded
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.styra.opa.openapi.models.shared.GzipContentEncoding> contentEncoding() {
        return (Optional<com.styra.opa.openapi.models.shared.GzipContentEncoding>) contentEncoding;
    }

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding() {
        return (Optional<com.styra.opa.openapi.models.shared.GzipAcceptEncoding>) acceptEncoding;
    }

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> pretty() {
        return (Optional<Boolean>) pretty;
    }

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> provenance() {
        return (Optional<Boolean>) provenance;
    }

    /**
     * Return query explanation in addition to result.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.styra.opa.openapi.models.shared.Explain> explain() {
        return (Optional<com.styra.opa.openapi.models.shared.Explain>) explain;
    }

    /**
     * Return query performance metrics in addition to result.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> metrics() {
        return (Optional<Boolean>) metrics;
    }

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> instrument() {
        return (Optional<Boolean>) instrument;
    }

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> strictBuiltinErrors() {
        return (Optional<Boolean>) strictBuiltinErrors;
    }

    /**
     * The input document
     */
    @JsonIgnore
    public ExecutePolicyWithInputRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
     */
    public ExecutePolicyWithInputRequest withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Indicates that the request body is gzip encoded
     */
    public ExecutePolicyWithInputRequest withContentEncoding(com.styra.opa.openapi.models.shared.GzipContentEncoding contentEncoding) {
        Utils.checkNotNull(contentEncoding, "contentEncoding");
        this.contentEncoding = Optional.ofNullable(contentEncoding);
        return this;
    }

    /**
     * Indicates that the request body is gzip encoded
     */
    public ExecutePolicyWithInputRequest withContentEncoding(Optional<? extends com.styra.opa.openapi.models.shared.GzipContentEncoding> contentEncoding) {
        Utils.checkNotNull(contentEncoding, "contentEncoding");
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    public ExecutePolicyWithInputRequest withAcceptEncoding(com.styra.opa.openapi.models.shared.GzipAcceptEncoding acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = Optional.ofNullable(acceptEncoding);
        return this;
    }

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    public ExecutePolicyWithInputRequest withAcceptEncoding(Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = acceptEncoding;
        return this;
    }

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    public ExecutePolicyWithInputRequest withPretty(boolean pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = Optional.ofNullable(pretty);
        return this;
    }

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    public ExecutePolicyWithInputRequest withPretty(Optional<? extends Boolean> pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = pretty;
        return this;
    }

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    public ExecutePolicyWithInputRequest withProvenance(boolean provenance) {
        Utils.checkNotNull(provenance, "provenance");
        this.provenance = Optional.ofNullable(provenance);
        return this;
    }

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    public ExecutePolicyWithInputRequest withProvenance(Optional<? extends Boolean> provenance) {
        Utils.checkNotNull(provenance, "provenance");
        this.provenance = provenance;
        return this;
    }

    /**
     * Return query explanation in addition to result.
     */
    public ExecutePolicyWithInputRequest withExplain(com.styra.opa.openapi.models.shared.Explain explain) {
        Utils.checkNotNull(explain, "explain");
        this.explain = Optional.ofNullable(explain);
        return this;
    }

    /**
     * Return query explanation in addition to result.
     */
    public ExecutePolicyWithInputRequest withExplain(Optional<? extends com.styra.opa.openapi.models.shared.Explain> explain) {
        Utils.checkNotNull(explain, "explain");
        this.explain = explain;
        return this;
    }

    /**
     * Return query performance metrics in addition to result.
     */
    public ExecutePolicyWithInputRequest withMetrics(boolean metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = Optional.ofNullable(metrics);
        return this;
    }

    /**
     * Return query performance metrics in addition to result.
     */
    public ExecutePolicyWithInputRequest withMetrics(Optional<? extends Boolean> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = metrics;
        return this;
    }

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    public ExecutePolicyWithInputRequest withInstrument(boolean instrument) {
        Utils.checkNotNull(instrument, "instrument");
        this.instrument = Optional.ofNullable(instrument);
        return this;
    }

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    public ExecutePolicyWithInputRequest withInstrument(Optional<? extends Boolean> instrument) {
        Utils.checkNotNull(instrument, "instrument");
        this.instrument = instrument;
        return this;
    }

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    public ExecutePolicyWithInputRequest withStrictBuiltinErrors(boolean strictBuiltinErrors) {
        Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
        this.strictBuiltinErrors = Optional.ofNullable(strictBuiltinErrors);
        return this;
    }

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    public ExecutePolicyWithInputRequest withStrictBuiltinErrors(Optional<? extends Boolean> strictBuiltinErrors) {
        Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
        this.strictBuiltinErrors = strictBuiltinErrors;
        return this;
    }

    /**
     * The input document
     */
    public ExecutePolicyWithInputRequest withRequestBody(ExecutePolicyWithInputRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        ExecutePolicyWithInputRequest other = (ExecutePolicyWithInputRequest) o;
        return 
            java.util.Objects.deepEquals(this.path, other.path) &&
            java.util.Objects.deepEquals(this.contentEncoding, other.contentEncoding) &&
            java.util.Objects.deepEquals(this.acceptEncoding, other.acceptEncoding) &&
            java.util.Objects.deepEquals(this.pretty, other.pretty) &&
            java.util.Objects.deepEquals(this.provenance, other.provenance) &&
            java.util.Objects.deepEquals(this.explain, other.explain) &&
            java.util.Objects.deepEquals(this.metrics, other.metrics) &&
            java.util.Objects.deepEquals(this.instrument, other.instrument) &&
            java.util.Objects.deepEquals(this.strictBuiltinErrors, other.strictBuiltinErrors) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            path,
            contentEncoding,
            acceptEncoding,
            pretty,
            provenance,
            explain,
            metrics,
            instrument,
            strictBuiltinErrors,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecutePolicyWithInputRequest.class,
                "path", path,
                "contentEncoding", contentEncoding,
                "acceptEncoding", acceptEncoding,
                "pretty", pretty,
                "provenance", provenance,
                "explain", explain,
                "metrics", metrics,
                "instrument", instrument,
                "strictBuiltinErrors", strictBuiltinErrors,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String path;
 
        private Optional<? extends com.styra.opa.openapi.models.shared.GzipContentEncoding> contentEncoding = Optional.empty();
 
        private Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding = Optional.empty();
 
        private Optional<? extends Boolean> pretty = Optional.empty();
 
        private Optional<? extends Boolean> provenance = Optional.empty();
 
        private Optional<? extends com.styra.opa.openapi.models.shared.Explain> explain = Optional.empty();
 
        private Optional<? extends Boolean> metrics = Optional.empty();
 
        private Optional<? extends Boolean> instrument = Optional.empty();
 
        private Optional<? extends Boolean> strictBuiltinErrors = Optional.empty();
 
        private ExecutePolicyWithInputRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * Indicates that the request body is gzip encoded
         */
        public Builder contentEncoding(com.styra.opa.openapi.models.shared.GzipContentEncoding contentEncoding) {
            Utils.checkNotNull(contentEncoding, "contentEncoding");
            this.contentEncoding = Optional.ofNullable(contentEncoding);
            return this;
        }

        /**
         * Indicates that the request body is gzip encoded
         */
        public Builder contentEncoding(Optional<? extends com.styra.opa.openapi.models.shared.GzipContentEncoding> contentEncoding) {
            Utils.checkNotNull(contentEncoding, "contentEncoding");
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
         */
        public Builder acceptEncoding(com.styra.opa.openapi.models.shared.GzipAcceptEncoding acceptEncoding) {
            Utils.checkNotNull(acceptEncoding, "acceptEncoding");
            this.acceptEncoding = Optional.ofNullable(acceptEncoding);
            return this;
        }

        /**
         * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
         */
        public Builder acceptEncoding(Optional<? extends com.styra.opa.openapi.models.shared.GzipAcceptEncoding> acceptEncoding) {
            Utils.checkNotNull(acceptEncoding, "acceptEncoding");
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        /**
         * If parameter is `true`, response will formatted for humans.
         */
        public Builder pretty(boolean pretty) {
            Utils.checkNotNull(pretty, "pretty");
            this.pretty = Optional.ofNullable(pretty);
            return this;
        }

        /**
         * If parameter is `true`, response will formatted for humans.
         */
        public Builder pretty(Optional<? extends Boolean> pretty) {
            Utils.checkNotNull(pretty, "pretty");
            this.pretty = pretty;
            return this;
        }

        /**
         * If parameter is true, response will include build/version info in addition to the result.
         */
        public Builder provenance(boolean provenance) {
            Utils.checkNotNull(provenance, "provenance");
            this.provenance = Optional.ofNullable(provenance);
            return this;
        }

        /**
         * If parameter is true, response will include build/version info in addition to the result.
         */
        public Builder provenance(Optional<? extends Boolean> provenance) {
            Utils.checkNotNull(provenance, "provenance");
            this.provenance = provenance;
            return this;
        }

        /**
         * Return query explanation in addition to result.
         */
        public Builder explain(com.styra.opa.openapi.models.shared.Explain explain) {
            Utils.checkNotNull(explain, "explain");
            this.explain = Optional.ofNullable(explain);
            return this;
        }

        /**
         * Return query explanation in addition to result.
         */
        public Builder explain(Optional<? extends com.styra.opa.openapi.models.shared.Explain> explain) {
            Utils.checkNotNull(explain, "explain");
            this.explain = explain;
            return this;
        }

        /**
         * Return query performance metrics in addition to result.
         */
        public Builder metrics(boolean metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = Optional.ofNullable(metrics);
            return this;
        }

        /**
         * Return query performance metrics in addition to result.
         */
        public Builder metrics(Optional<? extends Boolean> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = metrics;
            return this;
        }

        /**
         * Instrument query evaluation and return a superset of performance metrics in addition to result.
         */
        public Builder instrument(boolean instrument) {
            Utils.checkNotNull(instrument, "instrument");
            this.instrument = Optional.ofNullable(instrument);
            return this;
        }

        /**
         * Instrument query evaluation and return a superset of performance metrics in addition to result.
         */
        public Builder instrument(Optional<? extends Boolean> instrument) {
            Utils.checkNotNull(instrument, "instrument");
            this.instrument = instrument;
            return this;
        }

        /**
         * Treat built-in function call errors as fatal and return an error immediately.
         */
        public Builder strictBuiltinErrors(boolean strictBuiltinErrors) {
            Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
            this.strictBuiltinErrors = Optional.ofNullable(strictBuiltinErrors);
            return this;
        }

        /**
         * Treat built-in function call errors as fatal and return an error immediately.
         */
        public Builder strictBuiltinErrors(Optional<? extends Boolean> strictBuiltinErrors) {
            Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
            this.strictBuiltinErrors = strictBuiltinErrors;
            return this;
        }

        /**
         * The input document
         */
        public Builder requestBody(ExecutePolicyWithInputRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public ExecutePolicyWithInputRequest build() {
            if (path == null) {
                path = _SINGLETON_VALUE_Path.value();
            }
            return new ExecutePolicyWithInputRequest(
                path,
                contentEncoding,
                acceptEncoding,
                pretty,
                provenance,
                explain,
                metrics,
                instrument,
                strictBuiltinErrors,
                requestBody);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Path =
                new LazySingletonValue<>(
                        "path",
                        "\"\"",
                        new TypeReference<String>() {});
    }
}

