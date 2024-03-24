package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InheritScale {
    @JsonProperty("Skill")
    public String skill;
    @JsonProperty("EffectId")
    public int effectId;
    @JsonProperty("Parameter")
    public int parameter;
}
