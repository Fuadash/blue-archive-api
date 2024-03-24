package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class EffectCombineLabel {
    @JsonProperty("Icon")
    public ArrayList<String> icon;
    @JsonProperty("StackLabelTranslated")
    public ArrayList<String> stackLabelTranslated;
    @JsonProperty("DisableFirst")
    public boolean disableFirst;
    @JsonProperty("StackLabel")
    public ArrayList<String> stackLabel;
}
