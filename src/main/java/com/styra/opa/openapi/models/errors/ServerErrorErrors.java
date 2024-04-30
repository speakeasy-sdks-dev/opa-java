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
import java.util.Optional;


public class ServerErrorErrors {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<? extends ServerErrorLocation> location;

    @JsonCreator
    public ServerErrorErrors(
            @JsonProperty("code") String code,
            @JsonProperty("message") String message,
            @JsonProperty("location") Optional<? extends ServerErrorLocation> location) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(location, "location");
        this.code = code;
        this.message = message;
        this.location = location;
    }
    
    public ServerErrorErrors(
            String code,
            String message) {
        this(code, message, Optional.empty());
    }

    @JsonIgnore
    public String code() {
        return code;
    }

    @JsonIgnore
    public String message() {
        return message;
    }

    @JsonIgnore
    public Optional<ServerErrorLocation> location() {
        return (Optional<ServerErrorLocation>) location;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ServerErrorErrors withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public ServerErrorErrors withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public ServerErrorErrors withLocation(ServerErrorLocation location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public ServerErrorErrors withLocation(Optional<? extends ServerErrorLocation> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
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
        ServerErrorErrors other = (ServerErrorErrors) o;
        return 
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            message,
            location);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServerErrorErrors.class,
                "code", code,
                "message", message,
                "location", location);
    }
    
    public final static class Builder {
 
        private String code;
 
        private String message;
 
        private Optional<? extends ServerErrorLocation> location = Optional.empty();  
        
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

        public Builder location(ServerErrorLocation location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<? extends ServerErrorLocation> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }
        
        public ServerErrorErrors build() {
            return new ServerErrorErrors(
                code,
                message,
                location);
        }
    }
}

