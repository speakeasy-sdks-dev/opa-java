/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.styra.opa.openapi.models.shared.Input;
import com.styra.opa.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * ExecutePolicyWithInputRequestBody - The input document
 */

public class ExecutePolicyWithInputRequestBody {

    /**
     * Arbitrary JSON used within your policies by accessing `input`
     */
    @JsonProperty("input")
    private Input input;

    @JsonCreator
    public ExecutePolicyWithInputRequestBody(
            @JsonProperty("input") Input input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
    }

    /**
     * Arbitrary JSON used within your policies by accessing `input`
     */
    @JsonIgnore
    public Input input() {
        return input;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Arbitrary JSON used within your policies by accessing `input`
     */
    public ExecutePolicyWithInputRequestBody withInput(Input input) {
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
            Objects.deepEquals(this.input, other.input);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            input);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecutePolicyWithInputRequestBody.class,
                "input", input);
    }
    
    public final static class Builder {
 
        private Input input;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Arbitrary JSON used within your policies by accessing `input`
         */
        public Builder input(Input input) {
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

