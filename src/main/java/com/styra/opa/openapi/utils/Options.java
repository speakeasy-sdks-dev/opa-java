/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.utils;

import java.util.Optional;
import java.util.List;

public class Options {

    public enum Option {
        RETRY_CONFIG;
    }

    private Optional<com.styra.opa.openapi.utils.RetryConfig> retryConfig = Optional.empty();

    private Options(Optional<com.styra.opa.openapi.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
    }

    public Optional<com.styra.opa.openapi.utils.RetryConfig> retryConfig() {
        return retryConfig;
    }

    public final void validate(List<Option> supportedOptions) throws IllegalArgumentException {
        if (this.retryConfig.isPresent() && !supportedOptions.contains(Option.RETRY_CONFIG)) {
            throw new IllegalArgumentException("retryConfig is not supported for this operation.");
        }
    }

    public final static Builder builder() {
        return new Builder();
    }

    public final static class Builder {

        private Optional<com.styra.opa.openapi.utils.RetryConfig> retryConfig = Optional.empty();

        private Builder() {}

        public Builder retryConfig(com.styra.opa.openapi.utils.RetryConfig retryConfig) throws IllegalArgumentException {
            Utils.checkNotNull(retryConfig, "retryConfig");
            this.retryConfig = Optional.of(retryConfig);
            return this;
        }

        public Builder retryConfig(Optional<com.styra.opa.openapi.utils.RetryConfig> retryConfig) throws IllegalArgumentException {
            Utils.checkNotNull(retryConfig, "retryConfig");
            this.retryConfig = retryConfig;
            return this;
        }

        public Options build() {
            return new Options(retryConfig);
        }
    }
}
