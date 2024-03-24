package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Skill {
    @JsonProperty("SkillType")
    public String skillType;
    @JsonProperty("Effects")
    public ArrayList<Effect> effects;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Desc")
    public String desc;
    @JsonProperty("Parameters")
    public ArrayList<ArrayList<String>> parameters;
    @JsonProperty("Cost")
    public ArrayList<Integer> cost;
    @JsonProperty("Duration")
    public int duration;
    @JsonProperty("Range")
    public int range;
    @JsonProperty("Radius")
    public ArrayList<Radius> radius;
    @JsonProperty("Icon")
    public String icon;
    @JsonProperty("EffectCombine")
    public ArrayList<String> effectCombine;
    @JsonProperty("EffectCombineLabel")
    public EffectCombineLabel effectCombineLabel;
    @JsonProperty("ExtraSkills")
    public ArrayList<ExtraSkill> extraSkills;
    @JsonProperty("InheritScale")
    public InheritScale inheritScale;
    @JsonProperty("HideCalculation")
    public boolean hideCalculation;
}
