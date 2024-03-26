package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Effect {
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Hits")
    private ArrayList<Integer> hits;
    @JsonProperty("Scale")
    private ArrayList<Integer> scale;
    @JsonProperty("Frames")
    private Frames frames;
    @JsonProperty("CriticalCheck")
    private String criticalCheck;
    @JsonProperty("Stat")
    private String stat;
    @JsonProperty("Value")
    private ArrayList<ArrayList<Integer>> value;
    @JsonProperty("Channel")
    private int channel;
    @JsonProperty("Duration")
    private int duration;
    @JsonProperty("Period")
    private int period;
    @JsonProperty("ExtraStatSource")
    private String extraStatSource;
    @JsonProperty("ExtraStatRate")
    private ArrayList<Integer> extraStatRate;
    @JsonProperty("HitsParameter")
    private int hitsParameter;
    @JsonProperty("Chance")
    private int chance;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("SubstituteCondition")
    private String substituteCondition;
    @JsonProperty("SubstituteScale")
    private ArrayList<Integer> substituteScale;
    @JsonProperty("MultiplySource")
    private String multiplySource;
    @JsonProperty("MultiplierConstant")
    private ArrayList<Integer> multiplierConstant;
    @JsonProperty("HitFrames")
    private ArrayList<Integer> hitFrames;
    @JsonProperty("IgnoreDelay")
    private ArrayList<Integer> ignoreDelay;
    @JsonProperty("StackSame")
    private int stackSame;
    @JsonProperty("IgnoreDef")
    private ArrayList<Integer> ignoreDef;
    @JsonProperty("OverrideSlot")
    private String overrideSlot;
    @JsonProperty("Restrictions")
    private ArrayList<Restriction> restrictions;
    @JsonProperty("ZoneHitInterval")
    private int zoneHitInterval;
    @JsonProperty("ZoneDuration")
    private int zoneDuration;
    @JsonProperty("Critical")
    private int critical;
    @JsonProperty("HideFormChangeIcon")
    private boolean hideFormChangeIcon;
    @JsonProperty("SourceStat")
    private String sourceStat;
    @JsonProperty("ExtraDamageSource")
    private ExtraDamageSource extraDamageSource;
    @JsonProperty("ApplyStability")
    private boolean applyStability;

    public String getType() {
        return type;
    }

    public ArrayList<Integer> getHits() {
        return hits;
    }

    public ArrayList<Integer> getScale() {
        return scale;
    }

    public Frames getFrames() {
        return frames;
    }

    public String getCriticalCheck() {
        return criticalCheck;
    }

    public String getStat() {
        return stat;
    }

    public ArrayList<ArrayList<Integer>> getValue() {
        return value;
    }

    public int getChannel() {
        return channel;
    }

    public int getDuration() {
        return duration;
    }

    public int getPeriod() {
        return period;
    }

    public String getExtraStatSource() {
        return extraStatSource;
    }

    public ArrayList<Integer> getExtraStatRate() {
        return extraStatRate;
    }

    public int getHitsParameter() {
        return hitsParameter;
    }

    public int getChance() {
        return chance;
    }

    public String getIcon() {
        return icon;
    }

    public String getSubstituteCondition() {
        return substituteCondition;
    }

    public ArrayList<Integer> getSubstituteScale() {
        return substituteScale;
    }

    public String getMultiplySource() {
        return multiplySource;
    }

    public ArrayList<Integer> getMultiplierConstant() {
        return multiplierConstant;
    }

    public ArrayList<Integer> getHitFrames() {
        return hitFrames;
    }

    public ArrayList<Integer> getIgnoreDelay() {
        return ignoreDelay;
    }

    public int getStackSame() {
        return stackSame;
    }

    public ArrayList<Integer> getIgnoreDef() {
        return ignoreDef;
    }

    public String getOverrideSlot() {
        return overrideSlot;
    }

    public ArrayList<Restriction> getRestrictions() {
        return restrictions;
    }

    public int getZoneHitInterval() {
        return zoneHitInterval;
    }

    public int getZoneDuration() {
        return zoneDuration;
    }

    public int getCritical() {
        return critical;
    }

    public boolean isHideFormChangeIcon() {
        return hideFormChangeIcon;
    }

    public String getSourceStat() {
        return sourceStat;
    }

    public ExtraDamageSource getExtraDamageSource() {
        return extraDamageSource;
    }

    public boolean isApplyStability() {
        return applyStability;
    }
}
