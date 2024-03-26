package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class EffectCombineLabel {
    @JsonProperty("Icon")
    private ArrayList<String> icon;
    @JsonProperty("StackLabelTranslated")
    private ArrayList<String> stackLabelTranslated;
    @JsonProperty("DisableFirst")
    private boolean disableFirst;
    @JsonProperty("StackLabel")
    private ArrayList<String> stackLabel;

    public ArrayList<String> getIcon() {
        return icon;
    }

    public ArrayList<String> getStackLabelTranslated() {
        return stackLabelTranslated;
    }

    public boolean isDisableFirst() {
        return disableFirst;
    }

    public ArrayList<String> getStackLabel() {
        return stackLabel;
    }
}
