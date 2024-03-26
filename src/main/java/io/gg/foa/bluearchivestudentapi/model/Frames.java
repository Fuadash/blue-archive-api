package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Frames {
    @JsonProperty("AttackEnterDuration")
    private int attackEnterDuration;
    @JsonProperty("AttackStartDuration")
    private int attackStartDuration;
    @JsonProperty("AttackEndDuration")
    private int attackEndDuration;
    @JsonProperty("AttackBurstRoundOverDelay")
    private int attackBurstRoundOverDelay;
    @JsonProperty("AttackIngDuration")
    private int attackIngDuration;
    @JsonProperty("AttackReloadDuration")
    private int attackReloadDuration;
    @JsonProperty("AttackReadyStartDuration")
    private int attackReadyStartDuration;
    @JsonProperty("AttackReadyEndDuration")
    private int attackReadyEndDuration;

    public int getAttackEnterDuration() {
        return attackEnterDuration;
    }

    public int getAttackStartDuration() {
        return attackStartDuration;
    }

    public int getAttackEndDuration() {
        return attackEndDuration;
    }

    public int getAttackBurstRoundOverDelay() {
        return attackBurstRoundOverDelay;
    }

    public int getAttackIngDuration() {
        return attackIngDuration;
    }

    public int getAttackReloadDuration() {
        return attackReloadDuration;
    }

    public int getAttackReadyStartDuration() {
        return attackReadyStartDuration;
    }

    public int getAttackReadyEndDuration() {
        return attackReadyEndDuration;
    }
}
