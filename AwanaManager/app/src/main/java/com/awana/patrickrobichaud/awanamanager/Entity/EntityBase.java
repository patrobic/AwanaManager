package com.awana.patrickrobichaud.awanamanager.Entity;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

enum Color
{
    Red,
    Blue,
    Green,
    Yellow
}

enum Group
{
    Cubbies,
    Sparks,
    TAndT,
    Trek,
    Journey
}

enum Role
{
    Helper,
    LeaderInTraining,
    Leader,
    GamesDirector,
    GroupDirector,
    AttendanceDirector,
    Commander,
    Secretary
}

enum Book
{
    AppleSeed,
    HoneyComb,
    HangGlider,
    WingRunner,
    SkyStormer,
    UltimateAdventure1,
    UltimateAdventure2,
    UltimateChallenge1,
    UltimateChallenge2,
    HisStory,
    HisLove,
    HisPeople,
    Disciples,
    Advocates
}

enum SparksChapter
{
    RedJewel1,
    GreenJewel1,
    RedJewel2,
    GreenJewel2,
    RedJewel3,
    GreenJewel3,
    RedJewel4,
    GreenJewel4,
}

enum TAndTChapter
{
    Discovery1,
    Discovery2,
    Discovery3,
    Discovery4,
    Discovery5,
    Discovery6,
    Discovery7,
    Discovery8
}

enum Section
{
    One,
    Two,
    Three,
    Four
}
enum Module
{
    Attendance,
    Sections,
    Games
}

public abstract class EntityBase implements IEntity {
    public Integer GetDbId()
    {
        return _id;
    }

    public void SetDbId(Integer id)
    {
        _id = id;
    }

    protected Integer _id;
}
