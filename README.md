In progress REST API for hit mobile game Blue Archive, almost entirely for my own convenience in the future

## Endpoints


### getAllStudents

Description: Gets all students
- URL: `/student`
- Method: `GET`

##### Example Request:

`GET /student`

##### Example Response:

    {
        "10000": {
            "Id": 10000,
            "IsReleased": [
                true,
                true,
                true
            ],
            "DefaultOrder": 0,
            "PathName": "aru",
            "DevName": "Aru",
            "Name": "Aru",
            "Icon": "enemyinfo_aru_sr",
            "SearchTags": [],
            "School": "Gehenna",
            "Club": "Kohshinjo68",
            "StarGrade": 3,
            "SquadType": "Main",
            "TacticRole": "DamageDealer",
            "Summons": [],
            "Position": "Back",
            "BulletType": "Explosion",
            "ArmorType": "LightArmor",
            "StreetBattleAdaptation": 4,
            "OutdoorBattleAdaptation": 2,
            "IndoorBattleAdaptation": 0,
            "WeaponType": "SR",
            "WeaponImg": "weapon_icon_10000",
            "Cover": true,
            "Size": "Medium",
            "Equipment": [
                "Hat",
                "Hairpin",
                "Watch"
            ],
            "CollectionBG": "BG_Gehenna_Collection",
            "FamilyName": "Rikuhachima",
            "PersonalName": "Aru",
            "SchoolYear": "2nd Year",
            "CharacterAge": "16 years old",
            "Birthday": "March 12th",
            "CharacterSSRNew": "Heh heh. Good choice.",
            "ProfileIntroduction": "The self-proclaimed boss of Problem Solver 68.\n\nAru expanded Gehenna Academy's Problem Solver 68 club without permission to conduct illegal business activities. She aspires to be seen as a dashing and debonair villain, but her frequent blunders always expose her as a poser.",
            "Hobby": "Studying management",
            "CharacterVoice": "Reina Kondō",
            "BirthDay": "3/12",
            "Illustrator": "DoReMi",
            "Designer": "DoReMi",
            ...
        
        "10001": {
            "Id": 10001,
            "IsReleased": [
                true,
                true,
                true
            ],
            "DefaultOrder": 1,
            "PathName": "eimi",
            "DevName": "Eimi",
            "Name": "Eimi",
            "Icon": "enemyinfo_eimi_sg",
            "SearchTags": [],
            "School": "Millennium",
            "Club": "SPTF",
            "StarGrade": 3,
            "SquadType": "Main",
            "TacticRole": "Tanker",
            "Summons": [],
            "Position": "Front",
            "BulletType": "Explosion",
            "ArmorType": "LightArmor",
            "StreetBattleAdaptation": 4,
            "OutdoorBattleAdaptation": 2,
            "IndoorBattleAdaptation": 0,
            "WeaponType": "SG",
            "WeaponImg": "weapon_icon_10001",
            "Cover": false,
            "Size": "Medium",
            "Equipment": [
                "Shoes",
                "Bag",
                "Charm"
            ],
            "CollectionBG": "BG_Millennium_Collection",
            "FamilyName": "Izumimoto",
            "PersonalName": "Eimi",
        ...
        
    }

### getStudentById
- URL: /student/id/{id}

### getStudentsByGivenName
- URL: /student/givenName/{name}