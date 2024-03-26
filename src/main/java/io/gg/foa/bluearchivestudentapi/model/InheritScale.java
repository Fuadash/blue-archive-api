package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InheritScale {
    @JsonProperty("Skill")
    private String skill;
    @JsonProperty("EffectId")
    private int effectId;
    @JsonProperty("Parameter")
    private int parameter;

    public String getSkill() {
        return skill;
    }

    public int getEffectId() {
        return effectId;
    }

    public int getParameter() {
        return parameter;
    }
}
