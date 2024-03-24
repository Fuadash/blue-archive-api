package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restriction {
    @JsonProperty("Property")
    public String property;
    @JsonProperty("Operand")
    public String operand;
    @JsonProperty("Value")
    public Object value;
}
