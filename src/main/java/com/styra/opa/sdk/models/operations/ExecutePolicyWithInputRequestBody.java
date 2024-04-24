/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ExecutePolicyWithInputRequestBody - The input document
 */

public class ExecutePolicyWithInputRequestBody {

    /**
     * Arbitrary JSON used within your policies by accessing `input`
     */
    @JsonProperty("input")
    private com.styra.opa.sdk.models.shared.Input input;

    @JsonCreator
    public ExecutePolicyWithInputRequestBody(
            @JsonProperty("input") com.styra.opa.sdk.models.shared.Input input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
    }

    /**
     * Arbitrary JSON used within your policies by accessing `input`
     */
    @JsonIgnore
    public com.styra.opa.sdk.models.shared.Input input() {
        return input;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Arbitrary JSON used within your policies by accessing `input`
     */
    public ExecutePolicyWithInputRequestBody withInput(com.styra.opa.sdk.models.shared.Input input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
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
        ExecutePolicyWithInputRequestBody other = (ExecutePolicyWithInputRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.input, other.input);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            input);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecutePolicyWithInputRequestBody.class,
                "input", input);
    }
    
    public final static class Builder {
 
        private com.styra.opa.sdk.models.shared.Input input;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Arbitrary JSON used within your policies by accessing `input`
         */
        public Builder input(com.styra.opa.sdk.models.shared.Input input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }
        
        public ExecutePolicyWithInputRequestBody build() {
            return new ExecutePolicyWithInputRequestBody(
                input);
        }
    }
}

