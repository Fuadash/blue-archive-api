package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weapon {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Desc")
    private String desc;
    @JsonProperty("AdaptationType")
    private String adaptationType;
    @JsonProperty("AdaptationValue")
    private int adaptationValue;
    @JsonProperty("AttackPower1")
    private int attackPower1;
    @JsonProperty("AttackPower100")
    private int attackPower100;
    @JsonProperty("MaxHP1")
    private int maxHP1;
    @JsonProperty("MaxHP100")
    private int maxHP100;
    @JsonProperty("HealPower1")
    private int healPower1;
    @JsonProperty("HealPower100")
    private int healPower100;
    @JsonProperty("StatLevelUpType")
    private String statLevelUpType;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getAdaptationType() {
        return adaptationType;
    }

    public int getAdaptationValue() {
        return adaptationValue;
    }

    public int getAttackPower1() {
        return attackPower1;
    }

    public int getAttackPower100() {
        return attackPower100;
    }

    public int getMaxHP1() {
        return maxHP1;
    }

    public int getMaxHP100() {
        return maxHP100;
    }

    public int getHealPower1() {
        return healPower1;
    }

    public int getHealPower100() {
        return healPower100;
    }

    public String getStatLevelUpType() {
        return statLevelUpType;
    }
}