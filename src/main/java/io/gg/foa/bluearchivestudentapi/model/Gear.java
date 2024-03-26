package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Gear {
    @JsonProperty("Released")
    private ArrayList<Boolean> released;
    @JsonProperty("StatType")
    private ArrayList<String> statType;
    @JsonProperty("StatValue")
    private ArrayList<ArrayList<Integer>> statValue;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Desc")
    private String desc;
    @JsonProperty("TierUpMaterial")
    private ArrayList<ArrayList<Integer>> tierUpMaterial;
    @JsonProperty("TierUpMaterialAmount")
    private ArrayList<ArrayList<Integer>> tierUpMaterialAmount;

    public ArrayList<Boolean> getReleased() {
        return released;
    }

    public ArrayList<String> getStatType() {
        return statType;
    }

    public ArrayList<ArrayList<Integer>> getStatValue() {
        return statValue;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public ArrayList<ArrayList<Integer>> getTierUpMaterial() {
        return tierUpMaterial;
    }

    public ArrayList<ArrayList<Integer>> getTierUpMaterialAmount() {
        return tierUpMaterialAmount;
    }
}
