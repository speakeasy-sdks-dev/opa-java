/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.styra.opa.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.styra.opa.sdk.utils.TypedObject;
import com.styra.opa.sdk.utils.Utils.JsonShape;

/**
 * Result - The base or virtual document referred to by the URL path. If the path is undefined, this key will be omitted.
 */

@JsonDeserialize(using = Result._Deserializer.class)
public class Result {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private Result(TypedObject value) {
        this.value = value;
    }

    public static Result of(java.util.Map<String, java.lang.Object> value) {
        Utils.checkNotNull(value, "value");
        return new Result(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.util.Map<String, java.lang.Object>>(){}));
    }

    public static Result of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new Result(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Boolean>(){}));
    }

    public static Result of(String value) {
        Utils.checkNotNull(value, "value");
        return new Result(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static Result of(java.util.List<java.lang.Object> value) {
        Utils.checkNotNull(value, "value");
        return new Result(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.util.List<java.lang.Object>>(){}));
    }

    public static Result of(double value) {
        Utils.checkNotNull(value, "value");
        return new Result(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.util.Map<String, java.lang.Object>}</li>
     * <li>{@code boolean}</li>
     * <li>{@code String}</li>
     * <li>{@code java.util.List<java.lang.Object>}</li>
     * <li>{@code double}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Result other = (Result) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.styra.opa.sdk.utils.OneOfDeserializer<Result> {

        public _Deserializer() {
            super(Result.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<java.util.Map<String, java.lang.Object>>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<java.util.List<java.lang.Object>>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Double>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Result.class,
                "value", value);
    }
 
}
