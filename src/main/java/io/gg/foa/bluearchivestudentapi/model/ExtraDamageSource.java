package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ExtraDamageSource {
    @JsonProperty("Side")
    public String side;
    @JsonProperty("Stat")
    public String stat;
    @JsonProperty("Multiplier")
    public ArrayList<Integer> multiplier;
    @JsonProperty("SliderTranslation")
    public String sliderTranslation;
    @JsonProperty("SliderStep")
    public ArrayList<Double> sliderStep;
    @JsonProperty("SliderLabel")
    public ArrayList<Integer> sliderLabel;
    @JsonProperty("SliderLabelSuffix")
    public String sliderLabelSuffix;
    @JsonProperty("SimulatePerHit")
    public boolean simulatePerHit;
}
