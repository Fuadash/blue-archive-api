package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Skill {
    @JsonProperty("SkillType")
    private String skillType;
    @JsonProperty("Effects")
    private ArrayList<Effect> effects;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Desc")
    private String desc;
    @JsonProperty("Parameters")
    private ArrayList<ArrayList<String>> parameters;
    @JsonProperty("Cost")
    private ArrayList<Integer> cost;
    @JsonProperty("Duration")
    private int duration;
    @JsonProperty("Range")
    private int range;
    @JsonProperty("Radius")
    private ArrayList<Radius> radius;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("EffectCombine")
    private ArrayList<String> effectCombine;
    @JsonProperty("EffectCombineLabel")
    private EffectCombineLabel effectCombineLabel;
    @JsonProperty("ExtraSkills")
    private ArrayList<ExtraSkill> extraSkills;
    @JsonProperty("InheritScale")
    private InheritScale inheritScale;
    @JsonProperty("HideCalculation")
    private boolean hideCalculation;

    public String getSkillType() {
        return skillType;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
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

    public ArrayList<Integer> getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }

    public int getRange() {
        return range;
    }

    public ArrayList<Radius> getRadius() {
        return radius;
    }

    public String getIcon() {
        return icon;
    }

    public ArrayList<String> getEffectCombine() {
        return effectCombine;
    }

    public EffectCombineLabel getEffectCombineLabel() {
        return effectCombineLabel;
    }

    public ArrayList<ExtraSkill> getExtraSkills() {
        return extraSkills;
    }

    public InheritScale getInheritScale() {
        return inheritScale;
    }

    public boolean isHideCalculation() {
        return hideCalculation;
    }
}
