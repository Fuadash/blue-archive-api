package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Summon {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("SourceSkill")
    private String sourceSkill;
    @JsonProperty("InheritCasterStat")
    private ArrayList<String> inheritCasterStat;
    @JsonProperty("InheritCasterAmount")
    private ArrayList<ArrayList<Integer>> inheritCasterAmount;
    @JsonProperty("ObstacleMaxHP1")
    private int obstacleMaxHP1;
    @JsonProperty("ObstacleMaxHP100")
    private int obstacleMaxHP100;

    public int getId() {
        return id;
    }

    public String getSourceSkill() {
        return sourceSkill;
    }

    public ArrayList<String> getInheritCasterStat() {
        return inheritCasterStat;
    }

    public ArrayList<ArrayList<Integer>> getInheritCasterAmount() {
        return inheritCasterAmount;
    }

    public int getObstacleMaxHP1() {
        return obstacleMaxHP1;
    }

    public int getObstacleMaxHP100() {
        return obstacleMaxHP100;
    }
}
