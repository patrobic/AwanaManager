package com.awana.patrickrobichaud.awanamanager.Record;

import java.util.Date;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Games implements IRecord {
    public Date GetDate()
    {
        return _date;
    }
    public Group GetGroup()
    {
        return _group;
    }
    public Games GetGame()
    {
        return _games;
    }
    public Color GetFirstPlace()
    {
        return _first;
    }
    public Color GetSecondPlace()
    {
        return _second;
    }
    public String GetNote()
    {
        return _note;
    }

    public void SetDate(Date date)
    {
        _date = date;
    }
    public void SetGroup(Group gorup)
    {
        _group = group;
    }
    public void SetGame(Games games)
    {
        _games = games;
    }
    public void SetFirst(Color first)
    {
        _first = first;
    }
    public void SetSecond(Color second)
    {
        _second = second;
    }
    public void SetNote(String note)
    {
        _note = note;
    }

    Date _date;
    Group _group;
    Games _games;
    Color _first;
    Color _second;
    String _note;
}
