package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ExtraDamageSource {
    @JsonProperty("Side")
    private String side;
    @JsonProperty("Stat")
    private String stat;
    @JsonProperty("Multiplier")
    private ArrayList<Integer> multiplier;
    @JsonProperty("SliderTranslation")
    private String sliderTranslation;
    @JsonProperty("SliderStep")
    private ArrayList<Double> sliderStep;
    @JsonProperty("SliderLabel")
    private ArrayList<Integer> sliderLabel;
    @JsonProperty("SliderLabelSuffix")
    private String sliderLabelSuffix;
    @JsonProperty("SimulatePerHit")
    private boolean simulatePerHit;

    public String getSide() {
        return side;
    }

    public String getStat() {
        return stat;
    }

    public ArrayList<Integer> getMultiplier() {
        return multiplier;
    }

    public String getSliderTranslation() {
        return sliderTranslation;
    }

    public ArrayList<Double> getSliderStep() {
        return sliderStep;
    }

    public ArrayList<Integer> getSliderLabel() {
        return sliderLabel;
    }

    public String getSliderLabelSuffix() {
        return sliderLabelSuffix;
    }

    public boolean isSimulatePerHit() {
        return simulatePerHit;
    }
}
