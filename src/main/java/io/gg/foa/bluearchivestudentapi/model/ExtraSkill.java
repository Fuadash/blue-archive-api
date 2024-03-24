package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ExtraSkill {
    @JsonProperty("Id")
    public String id;
    @JsonProperty("SkillType")
    public String skillType;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Desc")
    public String desc;
    @JsonProperty("Parameters")
    public ArrayList<ArrayList<String>> parameters;
    @JsonProperty("Radius")
    public ArrayList<Radius> radius;
    @JsonProperty("Icon")
    public String icon;
    @JsonProperty("Effects")
    public ArrayList<Effect> effects;
    @JsonProperty("Duration")
    public int duration;
    @JsonProperty("Range")
    public int range;
    @JsonProperty("Cost")
    public ArrayList<Integer> cost;
    @JsonProperty("TSAId")
    public int tSAId;
}
