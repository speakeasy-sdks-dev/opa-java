/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.styra.opa.openapi.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Explain {
    NOTES("notes"),
    FAILS("fails"),
    FULL("full"),
    DEBUG("debug");

    @JsonValue
    private final String value;

    private Explain(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
