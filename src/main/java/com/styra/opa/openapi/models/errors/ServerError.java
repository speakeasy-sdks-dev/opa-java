/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.errors;

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
import java.net.http.HttpResponse;
import java.util.Optional;

/**
 * ServerError - Server Error
 */
public class ServerError extends RuntimeException {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends java.util.List<ServerErrorErrors>> errors;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decision_id")
    private Optional<? extends String> decisionId;

    @JsonCreator
    public ServerError(
            @JsonProperty("code") String code,
            @JsonProperty("message") String message,
            @JsonProperty("errors") Optional<? extends java.util.List<ServerErrorErrors>> errors,
            @JsonProperty("decision_id") Optional<? extends String> decisionId) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(decisionId, "decisionId");
        this.code = code;
        this.message = message;
        this.errors = errors;
        this.decisionId = decisionId;
    }
    
    public ServerError(
            String code,
            String message) {
        this(code, message, Optional.empty(), Optional.empty());
    }

    public String code(){
        return code;
    }

    public String message(){
        return message;
    }

    public Optional<? extends java.util.List<ServerErrorErrors>> errors(){
        return errors;
    }

    public Optional<? extends String> decisionId(){
        return decisionId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ServerError withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public ServerError withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public ServerError withErrors(java.util.List<ServerErrorErrors> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }
    
    public ServerError withErrors(Optional<? extends java.util.List<ServerErrorErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public ServerError withDecisionId(String decisionId) {
        Utils.checkNotNull(decisionId, "decisionId");
        this.decisionId = Optional.ofNullable(decisionId);
        return this;
    }
    
    public ServerError withDecisionId(Optional<? extends String> decisionId) {
        Utils.checkNotNull(decisionId, "decisionId");
        this.decisionId = decisionId;
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
        ServerError other = (ServerError) o;
        return
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.errors, other.errors) &&
            java.util.Objects.deepEquals(this.decisionId, other.decisionId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            message,
            errors,
            decisionId);
    }

    @Override
    public String toString() {
        return Utils.toString(ServerError.class,
                "code", code,
                "message", message,
                "errors", errors,
                "decisionId", decisionId);
    }

    public final static class Builder {

        private String code;

        private String message;

        private Optional<? extends java.util.List<ServerErrorErrors>> errors = Optional.empty();

        private Optional<? extends String> decisionId = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        public Builder errors(java.util.List<ServerErrorErrors> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }
        
        public Builder errors(Optional<? extends java.util.List<ServerErrorErrors>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder decisionId(String decisionId) {
            Utils.checkNotNull(decisionId, "decisionId");
            this.decisionId = Optional.ofNullable(decisionId);
            return this;
        }
        
        public Builder decisionId(Optional<? extends String> decisionId) {
            Utils.checkNotNull(decisionId, "decisionId");
            this.decisionId = decisionId;
            return this;
        }

        public ServerError build() {
            return new ServerError(
                code,
                message,
                errors,
                decisionId);
        }
    }
}
