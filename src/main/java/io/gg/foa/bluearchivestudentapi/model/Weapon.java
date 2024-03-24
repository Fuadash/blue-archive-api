package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weapon{
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Desc")
    public String desc;
    @JsonProperty("AdaptationType")
    public String adaptationType;
    @JsonProperty("AdaptationValue")
    public int adaptationValue;
    @JsonProperty("AttackPower1")
    public int attackPower1;
    @JsonProperty("AttackPower100")
    public int attackPower100;
    @JsonProperty("MaxHP1")
    public int maxHP1;
    @JsonProperty("MaxHP100")
    public int maxHP100;
    @JsonProperty("HealPower1")
    public int healPower1;
    @JsonProperty("HealPower100")
    public int healPower100;
    @JsonProperty("StatLevelUpType")
    public String statLevelUpType;
}