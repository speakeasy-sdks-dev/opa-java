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
import java.util.Map;
import java.util.Objects;

/**
 * ExecuteBatchPolicyWithInputRequestBody - The batch of inputs
 */

public class ExecuteBatchPolicyWithInputRequestBody {

    @JsonProperty("inputs")
    private Map<String, Input> inputs;

    @JsonCreator
    public ExecuteBatchPolicyWithInputRequestBody(
            @JsonProperty("inputs") Map<String, Input> inputs) {
        inputs = Utils.emptyMapIfNull(inputs);
        this.inputs = inputs;
    }

    @JsonIgnore
    public Map<String, Input> inputs() {
        return inputs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ExecuteBatchPolicyWithInputRequestBody withInputs(Map<String, Input> inputs) {
        Utils.checkNotNull(inputs, "inputs");
        this.inputs = inputs;
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
        ExecuteBatchPolicyWithInputRequestBody other = (ExecuteBatchPolicyWithInputRequestBody) o;
        return 
            Objects.deepEquals(this.inputs, other.inputs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            inputs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExecuteBatchPolicyWithInputRequestBody.class,
                "inputs", inputs);
    }
    
    public final static class Builder {
 
        private Map<String, Input> inputs;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder inputs(Map<String, Input> inputs) {
            Utils.checkNotNull(inputs, "inputs");
            this.inputs = inputs;
            return this;
        }
        
        public ExecuteBatchPolicyWithInputRequestBody build() {
            return new ExecuteBatchPolicyWithInputRequestBody(
                inputs);
        }
    }
}

