package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Radius {
    @JsonProperty("Type")
    public String type;
    @JsonProperty("Radius")
    public int radius;
    @JsonProperty("Degree")
    public int degree;
    @JsonProperty("Width")
    public int width;
    @JsonProperty("Height")
    public int height;
    @JsonProperty("ExcludeRadius")
    public int excludeRadius;
}
