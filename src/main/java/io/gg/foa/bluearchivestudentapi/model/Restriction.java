package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restriction {
    @JsonProperty("Property")
    private String property;
    @JsonProperty("Operand")
    private String operand;
    @JsonProperty("Value")
    private Object value;

    public String getProperty() {
        return property;
    }

    public String getOperand() {
        return operand;
    }

    public Object getValue() {
        return value;
    }
}
