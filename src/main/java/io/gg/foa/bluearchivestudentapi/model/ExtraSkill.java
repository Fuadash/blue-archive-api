package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ExtraSkill {
    @JsonProperty("Id")
    private String id;
    @JsonProperty("SkillType")
    private String skillType;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Desc")
    private String desc;
    @JsonProperty("Parameters")
    private ArrayList<ArrayList<String>> parameters;
    @JsonProperty("Radius")
    private ArrayList<Radius> radius;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("Effects")
    private ArrayList<Effect> effects;
    @JsonProperty("Duration")
    private int duration;
    @JsonProperty("Range")
    private int range;
    @JsonProperty("Cost")
    private ArrayList<Integer> cost;
    @JsonProperty("TSAId")
    private int tSAId;

    public String getId() {
        return id;
    }

    public String getSkillType() {
        return skillType;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public ArrayList<ArrayList<String>> getParameters() {
        return parameters;
    }

    public ArrayList<Radius> getRadius() {
        return radius;
    }

    public String getIcon() {
        return icon;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public int getDuration() {
        return duration;
    }

    public int getRange() {
        return range;
    }

    public ArrayList<Integer> getCost() {
        return cost;
    }

    public int gettSAId() {
        return tSAId;
    }
}
