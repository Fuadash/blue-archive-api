package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Frames {
    @JsonProperty("AttackEnterDuration")
    public int attackEnterDuration;
    @JsonProperty("AttackStartDuration")
    public int attackStartDuration;
    @JsonProperty("AttackEndDuration")
    public int attackEndDuration;
    @JsonProperty("AttackBurstRoundOverDelay")
    public int attackBurstRoundOverDelay;
    @JsonProperty("AttackIngDuration")
    public int attackIngDuration;
    @JsonProperty("AttackReloadDuration")
    public int attackReloadDuration;
    @JsonProperty("AttackReadyStartDuration")
    public int attackReadyStartDuration;
    @JsonProperty("AttackReadyEndDuration")
    public int attackReadyEndDuration;
}
