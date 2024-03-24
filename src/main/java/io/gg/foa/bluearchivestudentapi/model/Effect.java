package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Effect {
    @JsonProperty("Type")
    public String type;
    @JsonProperty("Hits")
    public ArrayList<Integer> hits;
    @JsonProperty("Scale")
    public ArrayList<Integer> scale;
    @JsonProperty("Frames")
    public Frames frames;
    @JsonProperty("CriticalCheck")
    public String criticalCheck;
    @JsonProperty("Stat")
    public String stat;
    @JsonProperty("Value")
    public ArrayList<ArrayList<Integer>> value;
    @JsonProperty("Channel")
    public int channel;
    @JsonProperty("Duration")
    public int duration;
    @JsonProperty("Period")
    public int period;
    @JsonProperty("ExtraStatSource")
    public String extraStatSource;
    @JsonProperty("ExtraStatRate")
    public ArrayList<Integer> extraStatRate;
    @JsonProperty("HitsParameter")
    public int hitsParameter;
    @JsonProperty("Chance")
    public int chance;
    @JsonProperty("Icon")
    public String icon;
    @JsonProperty("SubstituteCondition")
    public String substituteCondition;
    @JsonProperty("SubstituteScale")
    public ArrayList<Integer> substituteScale;
    @JsonProperty("MultiplySource")
    public String multiplySource;
    @JsonProperty("MultiplierConstant")
    public ArrayList<Integer> multiplierConstant;
    @JsonProperty("HitFrames")
    public ArrayList<Integer> hitFrames;
    @JsonProperty("IgnoreDelay")
    public ArrayList<Integer> ignoreDelay;
    @JsonProperty("StackSame")
    public int stackSame;
    @JsonProperty("IgnoreDef")
    public ArrayList<Integer> ignoreDef;
    @JsonProperty("OverrideSlot")
    public String overrideSlot;
    @JsonProperty("Restrictions")
    public ArrayList<Restriction> restrictions;
    @JsonProperty("ZoneHitInterval")
    public int zoneHitInterval;
    @JsonProperty("ZoneDuration")
    public int zoneDuration;
    @JsonProperty("Critical")
    public int critical;
    @JsonProperty("HideFormChangeIcon")
    public boolean hideFormChangeIcon;
    @JsonProperty("SourceStat")
    public String sourceStat;
    @JsonProperty("ExtraDamageSource")
    public ExtraDamageSource extraDamageSource;
    @JsonProperty("ApplyStability")
    public boolean applyStability;
}
