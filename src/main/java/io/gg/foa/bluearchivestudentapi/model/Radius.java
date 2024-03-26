package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Radius {
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Radius")
    private int radius;
    @JsonProperty("Degree")
    private int degree;
    @JsonProperty("Width")
    private int width;
    @JsonProperty("Height")
    private int height;
    @JsonProperty("ExcludeRadius")
    private int excludeRadius;

    public String getType() {
        return type;
    }

    public int getRadius() {
        return radius;
    }

    public int getDegree() {
        return degree;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getExcludeRadius() {
        return excludeRadius;
    }
}
