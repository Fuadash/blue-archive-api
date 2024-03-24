package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Gear {
    @JsonProperty("Released")
    public ArrayList<Boolean> released;
    @JsonProperty("StatType")
    public ArrayList<String> statType;
    @JsonProperty("StatValue")
    public ArrayList<ArrayList<Integer>> statValue;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Desc")
    public String desc;
    @JsonProperty("TierUpMaterial")
    public ArrayList<ArrayList<Integer>> tierUpMaterial;
    @JsonProperty("TierUpMaterialAmount")
    public ArrayList<ArrayList<Integer>> tierUpMaterialAmount;
}
