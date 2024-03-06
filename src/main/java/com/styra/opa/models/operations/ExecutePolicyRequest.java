/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.utils.LazySingletonValue;
import com.styra.opa.utils.SpeakeasyMetadata;
import com.styra.opa.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ExecutePolicyRequest {

    /**
     * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=path")
    private String path;

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Accept-Encoding")
    private Optional<? extends com.styra.opa.models.shared.GzipAcceptEncoding> acceptEncoding;

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
    private Optional<? extends com.styra.opa.models.shared.Explain> explain;

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

    public ExecutePolicyRequest(
            String path,
            Optional<? extends com.styra.opa.models.shared.GzipAcceptEncoding> acceptEncoding,
            Optional<? extends Boolean> pretty,
            Optional<? extends Boolean> provenance,
            Optional<? extends com.styra.opa.models.shared.Explain> explain,
            Optional<? extends Boolean> metrics,
            Optional<? extends Boolean> instrument,
            Optional<? extends Boolean> strictBuiltinErrors) {
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        Utils.checkNotNull(pretty, "pretty");
        Utils.checkNotNull(provenance, "provenance");
        Utils.checkNotNull(explain, "explain");
        Utils.checkNotNull(metrics, "metrics");
        Utils.checkNotNull(instrument, "instrument");
        Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
        this.path = path;
        this.acceptEncoding = acceptEncoding;
        this.pretty = pretty;
        this.provenance = provenance;
        this.explain = explain;
        this.metrics = metrics;
        this.instrument = instrument;
        this.strictBuiltinErrors = strictBuiltinErrors;
    }

    /**
     * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
     */
    public String path() {
        return path;
    }

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    public Optional<? extends com.styra.opa.models.shared.GzipAcceptEncoding> acceptEncoding() {
        return acceptEncoding;
    }

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    public Optional<? extends Boolean> pretty() {
        return pretty;
    }

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    public Optional<? extends Boolean> provenance() {
        return provenance;
    }

    /**
     * Return query explanation in addition to result.
     */
    public Optional<? extends com.styra.opa.models.shared.Explain> explain() {
        return explain;
    }

    /**
     * Return query performance metrics in addition to result.
     */
    public Optional<? extends Boolean> metrics() {
        return metrics;
    }

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    public Optional<? extends Boolean> instrument() {
        return instrument;
    }

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    public Optional<? extends Boolean> strictBuiltinErrors() {
        return strictBuiltinErrors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The path separator is used to access values inside object and array documents. If the path indexes into an array, the server will attempt to convert the array index to an integer. If the path element cannot be converted to an integer, the server will respond with 404.
     */
    public ExecutePolicyRequest withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    public ExecutePolicyRequest withAcceptEncoding(com.styra.opa.models.shared.GzipAcceptEncoding acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = Optional.ofNullable(acceptEncoding);
        return this;
    }

    /**
     * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
     */
    public ExecutePolicyRequest withAcceptEncoding(Optional<? extends com.styra.opa.models.shared.GzipAcceptEncoding> acceptEncoding) {
        Utils.checkNotNull(acceptEncoding, "acceptEncoding");
        this.acceptEncoding = acceptEncoding;
        return this;
    }

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    public ExecutePolicyRequest withPretty(boolean pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = Optional.ofNullable(pretty);
        return this;
    }

    /**
     * If parameter is `true`, response will formatted for humans.
     */
    public ExecutePolicyRequest withPretty(Optional<? extends Boolean> pretty) {
        Utils.checkNotNull(pretty, "pretty");
        this.pretty = pretty;
        return this;
    }

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    public ExecutePolicyRequest withProvenance(boolean provenance) {
        Utils.checkNotNull(provenance, "provenance");
        this.provenance = Optional.ofNullable(provenance);
        return this;
    }

    /**
     * If parameter is true, response will include build/version info in addition to the result.
     */
    public ExecutePolicyRequest withProvenance(Optional<? extends Boolean> provenance) {
        Utils.checkNotNull(provenance, "provenance");
        this.provenance = provenance;
        return this;
    }

    /**
     * Return query explanation in addition to result.
     */
    public ExecutePolicyRequest withExplain(com.styra.opa.models.shared.Explain explain) {
        Utils.checkNotNull(explain, "explain");
        this.explain = Optional.ofNullable(explain);
        return this;
    }

    /**
     * Return query explanation in addition to result.
     */
    public ExecutePolicyRequest withExplain(Optional<? extends com.styra.opa.models.shared.Explain> explain) {
        Utils.checkNotNull(explain, "explain");
        this.explain = explain;
        return this;
    }

    /**
     * Return query performance metrics in addition to result.
     */
    public ExecutePolicyRequest withMetrics(boolean metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = Optional.ofNullable(metrics);
        return this;
    }

    /**
     * Return query performance metrics in addition to result.
     */
    public ExecutePolicyRequest withMetrics(Optional<? extends Boolean> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = metrics;
        return this;
    }

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    public ExecutePolicyRequest withInstrument(boolean instrument) {
        Utils.checkNotNull(instrument, "instrument");
        this.instrument = Optional.ofNullable(instrument);
        return this;
    }

    /**
     * Instrument query evaluation and return a superset of performance metrics in addition to result.
     */
    public ExecutePolicyRequest withInstrument(Optional<? extends Boolean> instrument) {
        Utils.checkNotNull(instrument, "instrument");
        this.instrument = instrument;
        return this;
    }

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    public ExecutePolicyRequest withStrictBuiltinErrors(boolean strictBuiltinErrors) {
        Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
        this.strictBuiltinErrors = Optional.ofNullable(strictBuiltinErrors);
        return this;
    }

    /**
     * Treat built-in function call errors as fatal and return an error immediately.
     */
    public ExecutePolicyRequest withStrictBuiltinErrors(Optional<? extends Boolean> strictBuiltinErrors) {
        Utils.checkNotNull(strictBuiltinErrors, "strictBuiltinErrors");
        this.strictBuiltinErrors = strictBuiltinErrors;
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
        ExecutePolicyRequest other = (ExecutePolicyRequest) o;
        return 
            java.util.Objects.deepEquals(this.path, other.path) &&
            java.util.Objects.deepEquals(this.acceptEncoding, other.acceptEncoding) &&
            java.util.Objects.deepEquals(this.pretty, other.pretty) &&
            java.util.Objects.deepEquals(this.provenance, other.provenance) &&
            java.util.Objects.deepEquals(this.explain, other.explain) &&
            java.util.Objects.deepEquals(this.metrics, other.metrics) &&
            java.util.Objects.deepEquals(this.instrument, other.instrument) &&
            java.util.Objects.deepEquals(this.strictBuiltinErrors, other.strictBuiltinErrors);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            path,
            acceptEncoding,
            pretty,
            provenance,
            explain,
            metrics,
            instrument,
            strictBuiltinErrors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecutePolicyRequest.class,
                "path", path,
                "acceptEncoding", acceptEncoding,
                "pretty", pretty,
                "provenance", provenance,
                "explain", explain,
                "metrics", metrics,
                "instrument", instrument,
                "strictBuiltinErrors", strictBuiltinErrors);
    }
    
    public final static class Builder {
 
        private String path;
 
        private Optional<? extends com.styra.opa.models.shared.GzipAcceptEncoding> acceptEncoding = Optional.empty();
 
        private Optional<? extends Boolean> pretty = Optional.empty();
 
        private Optional<? extends Boolean> provenance = Optional.empty();
 
        private Optional<? extends com.styra.opa.models.shared.Explain> explain = Optional.empty();
 
        private Optional<? extends Boolean> metrics = Optional.empty();
 
        private Optional<? extends Boolean> instrument = Optional.empty();
 
        private Optional<? extends Boolean> strictBuiltinErrors = Optional.empty();  
        
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
         * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
         */
        public Builder acceptEncoding(com.styra.opa.models.shared.GzipAcceptEncoding acceptEncoding) {
            Utils.checkNotNull(acceptEncoding, "acceptEncoding");
            this.acceptEncoding = Optional.ofNullable(acceptEncoding);
            return this;
        }

        /**
         * Indicates the server should respond with a gzip encoded body. The server will send the compressed response only if its length is above `server.encoding.gzip.min_length` value. See the configuration section
         */
        public Builder acceptEncoding(Optional<? extends com.styra.opa.models.shared.GzipAcceptEncoding> acceptEncoding) {
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
        public Builder explain(com.styra.opa.models.shared.Explain explain) {
            Utils.checkNotNull(explain, "explain");
            this.explain = Optional.ofNullable(explain);
            return this;
        }

        /**
         * Return query explanation in addition to result.
         */
        public Builder explain(Optional<? extends com.styra.opa.models.shared.Explain> explain) {
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
        
        public ExecutePolicyRequest build() {
            if (path == null) {
                path = _SINGLETON_VALUE_Path.value();
            }
            return new ExecutePolicyRequest(
                path,
                acceptEncoding,
                pretty,
                provenance,
                explain,
                metrics,
                instrument,
                strictBuiltinErrors);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Path =
                new LazySingletonValue<>(
                        "path",
                        "\"\"",
                        new TypeReference<String>() {});
    }
}

