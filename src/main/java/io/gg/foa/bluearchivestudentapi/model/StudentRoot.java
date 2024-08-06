package io.gg.foa.bluearchivestudentapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class StudentRoot {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("IsReleased")
    private ArrayList<Boolean> isReleased;
    @JsonProperty("DefaultOrder")
    private int defaultOrder;
    @JsonProperty("LinkedCharacterId")
    private int linkedCharacterId;
    @JsonProperty("StyleId")
    private int styleId;
    @JsonProperty("PathName")
    private String pathName;
    @JsonProperty("DevName")
    private String devName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("School")
    private String school;
    @JsonProperty("Club")
    private String club;
    @JsonProperty("StarGrade")
    private int starGrade;
    @JsonProperty("SquadType")
    private String squadType;
    @JsonProperty("TacticRole")
    private String tacticRole;
    @JsonProperty("Summons")
    private ArrayList<Summon> summons;
    @JsonProperty("Position")
    private String position;
    @JsonProperty("BulletType")
    private String bulletType;
    @JsonProperty("ArmorType")
    private String armorType;
    @JsonProperty("StreetBattleAdaptation")
    private int streetBattleAdaptation;
    @JsonProperty("OutdoorBattleAdaptation")
    private int outdoorBattleAdaptation;
    @JsonProperty("IndoorBattleAdaptation")
    private int indoorBattleAdaptation;
    @JsonProperty("WeaponType")
    private String weaponType;
    @JsonProperty("WeaponImg")
    private String weaponImg;
    @JsonProperty("Cover")
    private boolean cover;
    @JsonProperty("Equipment")
    private ArrayList<String> equipment;
    @JsonProperty("CollectionBG")
    private String collectionBG;
    @JsonProperty("FamilyName")
    private String familyName;
    @JsonProperty("PersonalName")
    private String personalName;
    @JsonProperty("SchoolYear")
    private String schoolYear;
    @JsonProperty("CharacterAge")
    private String characterAge;
    @JsonProperty("Birthday")
    private String birthday;
    @JsonProperty("CharacterSSRNew")
    private String characterSSRNew;
    @JsonProperty("ProfileIntroduction")
    private String profileIntroduction;
    @JsonProperty("Hobby")
    private String hobby;
    @JsonProperty("CharacterVoice")
    private String characterVoice;
    @JsonProperty("BirthDay")
    private String birthDay;
    @JsonProperty("Illustrator")
    private String illustrator;
    @JsonProperty("Designer")
    private String designer;
    @JsonProperty("CharHeightMetric")
    private String charHeightMetric;
    @JsonProperty("CharHeightImperial")
    private String charHeightImperial;
    @JsonProperty("StabilityPoint")
    private int stabilityPoint;
    @JsonProperty("AttackPower1")
    private int attackPower1;
    @JsonProperty("AttackPower100")
    private int attackPower100;
    @JsonProperty("MaxHP1")
    private int maxHP1;
    @JsonProperty("MaxHP100")
    private int maxHP100;
    @JsonProperty("DefensePower1")
    private int defensePower1;
    @JsonProperty("DefensePower100")
    private int defensePower100;
    @JsonProperty("HealPower1")
    private int healPower1;
    @JsonProperty("HealPower100")
    private int healPower100;
    @JsonProperty("DodgePoint")
    private int dodgePoint;
    @JsonProperty("AccuracyPoint")
    private int accuracyPoint;
    @JsonProperty("CriticalPoint")
    private int criticalPoint;
    @JsonProperty("CriticalDamageRate")
    private int criticalDamageRate;
    @JsonProperty("AmmoCount")
    private int ammoCount;
    @JsonProperty("AmmoCost")
    private int ammoCost;
    @JsonProperty("Range")
    private int range;
    @JsonProperty("RegenCost")
    private int regenCost;
    @JsonProperty("Skills")
    private ArrayList<Skill> skills;
    @JsonProperty("FavorStatType")
    private ArrayList<String> favorStatType;
    @JsonProperty("FavorStatValue")
    private ArrayList<ArrayList<Integer>> favorStatValue;
    @JsonProperty("FavorAlts")
    private ArrayList<Integer> favorAlts;
    @JsonProperty("MemoryLobby")
    private ArrayList<Integer> memoryLobby;
    @JsonProperty("MemoryLobbyBGM")
    private String memoryLobbyBGM;
    @JsonProperty("FurnitureInteraction")
    private ArrayList<ArrayList<ArrayList<Integer>>> furnitureInteraction;
    @JsonProperty("FavorItemTags")
    private ArrayList<String> favorItemTags;
    @JsonProperty("FavorItemUniqueTags")
    private ArrayList<String> favorItemUniqueTags;
    @JsonProperty("IsLimited")
    private int isLimited;
    @JsonProperty("Weapon")
    private Weapon weapon;
    @JsonProperty("Gear")
    private Gear gear;
    @JsonProperty("SkillExMaterial")
    private ArrayList<ArrayList<Integer>> skillExMaterial;
    @JsonProperty("SkillExMaterialAmount")
    private ArrayList<ArrayList<Integer>> skillExMaterialAmount;
    @JsonProperty("SkillMaterial")
    private ArrayList<ArrayList<Integer>> skillMaterial;
    @JsonProperty("SkillMaterialAmount")
    private ArrayList<ArrayList<Integer>> skillMaterialAmount;
    @JsonProperty("TSAId")
    private int tSAId;
    @JsonProperty("DefensePenetration1")
    private int defensePenetration1;
    @JsonProperty("DefensePenetration100")
    private int defensePenetration100;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Boolean> getIsReleased() {
        return isReleased;
    }

    public int getDefaultOrder() {
        return defaultOrder;
    }

    public String getPathName() {
        return pathName;
    }

    public String getDevName() {
        return devName;
    }

    public String getSchool() {
        return school;
    }

    public String getClub() {
        return club;
    }

    public int getStarGrade() {
        return starGrade;
    }

    public String getSquadType() {
        return squadType;
    }

    public String getTacticRole() {
        return tacticRole;
    }

    public ArrayList<Summon> getSummons() {
        return summons;
    }

    public String getPosition() {
        return position;
    }

    public String getBulletType() {
        return bulletType;
    }

    public String getArmorType() {
        return armorType;
    }

    public int getStreetBattleAdaptation() {
        return streetBattleAdaptation;
    }

    public int getOutdoorBattleAdaptation() {
        return outdoorBattleAdaptation;
    }

    public int getIndoorBattleAdaptation() {
        return indoorBattleAdaptation;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponImg() {
        return weaponImg;
    }

    public boolean isCover() {
        return cover;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public String getCollectionBG() {
        return collectionBG;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPersonalName() {
        return personalName;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public String getCharacterAge() {
        return characterAge;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCharacterSSRNew() {
        return characterSSRNew;
    }

    public String getProfileIntroduction() {
        return profileIntroduction;
    }

    public String getHobby() {
        return hobby;
    }

    public String getCharacterVoice() {
        return characterVoice;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public String getDesigner() {
        return designer;
    }

    public String getCharHeightMetric() {
        return charHeightMetric;
    }

    public String getCharHeightImperial() {
        return charHeightImperial;
    }

    public int getStabilityPoint() {
        return stabilityPoint;
    }

    public int getAttackPower1() {
        return attackPower1;
    }

    public int getAttackPower100() {
        return attackPower100;
    }

    public int getMaxHP1() {
        return maxHP1;
    }

    public int getMaxHP100() {
        return maxHP100;
    }

    public int getDefensePower1() {
        return defensePower1;
    }

    public int getDefensePower100() {
        return defensePower100;
    }

    public int getHealPower1() {
        return healPower1;
    }

    public int getHealPower100() {
        return healPower100;
    }

    public int getDodgePoint() {
        return dodgePoint;
    }

    public int getAccuracyPoint() {
        return accuracyPoint;
    }

    public int getCriticalPoint() {
        return criticalPoint;
    }

    public int getCriticalDamageRate() {
        return criticalDamageRate;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public int getAmmoCost() {
        return ammoCost;
    }

    public int getRange() {
        return range;
    }

    public int getRegenCost() {
        return regenCost;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public ArrayList<String> getFavorStatType() {
        return favorStatType;
    }

    public ArrayList<ArrayList<Integer>> getFavorStatValue() {
        return favorStatValue;
    }

    public ArrayList<Integer> getFavorAlts() {
        return favorAlts;
    }

    public ArrayList<Integer> getMemoryLobby() {
        return memoryLobby;
    }

    public String getMemoryLobbyBGM() {
        return memoryLobbyBGM;
    }

    public ArrayList<ArrayList<ArrayList<Integer>>> getFurnitureInteraction() {
        return furnitureInteraction;
    }

    public ArrayList<String> getFavorItemTags() {
        return favorItemTags;
    }

    public ArrayList<String> getFavorItemUniqueTags() {
        return favorItemUniqueTags;
    }

    public int getIsLimited() {
        return isLimited;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Gear getGear() {
        return gear;
    }

    public ArrayList<ArrayList<Integer>> getSkillExMaterial() {
        return skillExMaterial;
    }

    public ArrayList<ArrayList<Integer>> getSkillExMaterialAmount() {
        return skillExMaterialAmount;
    }

    public ArrayList<ArrayList<Integer>> getSkillMaterial() {
        return skillMaterial;
    }

    public ArrayList<ArrayList<Integer>> getSkillMaterialAmount() {
        return skillMaterialAmount;
    }

    public int gettSAId() {
        return tSAId;
    }

    public int getDefensePenetration1() {
        return defensePenetration1;
    }

    public int getDefensePenetration100() {
        return defensePenetration100;
    }
}
