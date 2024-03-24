package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Summon {
    @JsonProperty("Id")
    public int id;
    @JsonProperty("SourceSkill")
    public String sourceSkill;
    @JsonProperty("InheritCasterStat")
    public ArrayList<String> inheritCasterStat;
    @JsonProperty("InheritCasterAmount")
    public ArrayList<ArrayList<Integer>> inheritCasterAmount;
    @JsonProperty("ObstacleMaxHP1")
    public int obstacleMaxHP1;
    @JsonProperty("ObstacleMaxHP100")
    public int obstacleMaxHP100;
}
