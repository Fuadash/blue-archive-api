package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class StudentRoot {
    @JsonProperty("Id")
    public int id;
    @JsonProperty("IsReleased")
    public ArrayList<Boolean> isReleased;
    @JsonProperty("DefaultOrder")
    public int defaultOrder;
    @JsonProperty("PathName")
    public String pathName;
    @JsonProperty("DevName")
    public String devName;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("School")
    public String school;
    @JsonProperty("Club")
    public String club;
    @JsonProperty("StarGrade")
    public int starGrade;
    @JsonProperty("SquadType")
    public String squadType;
    @JsonProperty("TacticRole")
    public String tacticRole;
    @JsonProperty("Summons")
    public ArrayList<Summon> summons;
    @JsonProperty("Position")
    public String position;
    @JsonProperty("BulletType")
    public String bulletType;
    @JsonProperty("ArmorType")
    public String armorType;
    @JsonProperty("StreetBattleAdaptation")
    public int streetBattleAdaptation;
    @JsonProperty("OutdoorBattleAdaptation")
    public int outdoorBattleAdaptation;
    @JsonProperty("IndoorBattleAdaptation")
    public int indoorBattleAdaptation;
    @JsonProperty("WeaponType")
    public String weaponType;
    @JsonProperty("WeaponImg")
    public String weaponImg;
    @JsonProperty("Cover")
    public boolean cover;
    @JsonProperty("Equipment")
    public ArrayList<String> equipment;
    @JsonProperty("CollectionBG")
    public String collectionBG;
    @JsonProperty("FamilyName")
    public String familyName;
    @JsonProperty("PersonalName")
    public String personalName;
    @JsonProperty("SchoolYear")
    public String schoolYear;
    @JsonProperty("CharacterAge")
    public String characterAge;
    @JsonProperty("Birthday")
    public String birthday;
    @JsonProperty("CharacterSSRNew")
    public String characterSSRNew;
    @JsonProperty("ProfileIntroduction")
    public String profileIntroduction;
    @JsonProperty("Hobby")
    public String hobby;
    @JsonProperty("CharacterVoice")
    public String characterVoice;
    @JsonProperty("BirthDay")
    public String birthDay;
    @JsonProperty("Illustrator")
    public String illustrator;
    @JsonProperty("Designer")
    public String designer;
    @JsonProperty("CharHeightMetric")
    public String charHeightMetric;
    @JsonProperty("CharHeightImperial")
    public String charHeightImperial;
    @JsonProperty("StabilityPoint")
    public int stabilityPoint;
    @JsonProperty("AttackPower1")
    public int attackPower1;
    @JsonProperty("AttackPower100")
    public int attackPower100;
    @JsonProperty("MaxHP1")
    public int maxHP1;
    @JsonProperty("MaxHP100")
    public int maxHP100;
    @JsonProperty("DefensePower1")
    public int defensePower1;
    @JsonProperty("DefensePower100")
    public int defensePower100;
    @JsonProperty("HealPower1")
    public int healPower1;
    @JsonProperty("HealPower100")
    public int healPower100;
    @JsonProperty("DodgePoint")
    public int dodgePoint;
    @JsonProperty("AccuracyPoint")
    public int accuracyPoint;
    @JsonProperty("CriticalPoint")
    public int criticalPoint;
    @JsonProperty("CriticalDamageRate")
    public int criticalDamageRate;
    @JsonProperty("AmmoCount")
    public int ammoCount;
    @JsonProperty("AmmoCost")
    public int ammoCost;
    @JsonProperty("Range")
    public int range;
    @JsonProperty("RegenCost")
    public int regenCost;
    @JsonProperty("Skills")
    public ArrayList<Skill> skills;
    @JsonProperty("FavorStatType")
    public ArrayList<String> favorStatType;
    @JsonProperty("FavorStatValue")
    public ArrayList<ArrayList<Integer>> favorStatValue;
    @JsonProperty("FavorAlts")
    public ArrayList<Integer> favorAlts;
    @JsonProperty("MemoryLobby")
    public ArrayList<Integer> memoryLobby;
    @JsonProperty("MemoryLobbyBGM")
    public String memoryLobbyBGM;
    @JsonProperty("FurnitureInteraction")
    public ArrayList<ArrayList<ArrayList<Integer>>> furnitureInteraction;
    @JsonProperty("FavorItemTags")
    public ArrayList<String> favorItemTags;
    @JsonProperty("FavorItemUniqueTags")
    public ArrayList<String> favorItemUniqueTags;
    @JsonProperty("IsLimited")
    public int isLimited;
    @JsonProperty("Weapon")
    public Weapon weapon;
    @JsonProperty("Gear")
    public Gear gear;
    @JsonProperty("SkillExMaterial")
    public ArrayList<ArrayList<Integer>> skillExMaterial;
    @JsonProperty("SkillExMaterialAmount")
    public ArrayList<ArrayList<Integer>> skillExMaterialAmount;
    @JsonProperty("SkillMaterial")
    public ArrayList<ArrayList<Integer>> skillMaterial;
    @JsonProperty("SkillMaterialAmount")
    public ArrayList<ArrayList<Integer>> skillMaterialAmount;
    @JsonProperty("TSAId")
    public int tSAId;
    @JsonProperty("DefensePenetration1")
    public int defensePenetration1;
    @JsonProperty("DefensePenetration100")
    public int defensePenetration100;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
