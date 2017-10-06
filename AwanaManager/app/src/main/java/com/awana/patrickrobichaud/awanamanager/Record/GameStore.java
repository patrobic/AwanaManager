package com.awana.patrickrobichaud.awanamanager.Record;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class GameStore implements IRecordStore {
    public Games GetRecord(Date date)
    {

    }
    public Integer GetTeamTotal(Date date, Color color)
    {
        int total = 0;
        for(int i = 0; i < _games.size(); ++i)
        {
            if(_games.get(i).GetDate() == date)
                if(_games.get(i).GetFirstPlace() == color)
                    total += 2;
                else if(_games.get(i).GetSecondPlace() == color)
                    total += 1;
        }
        return total;
    }
    public void AddRecord(Games game)
    {
        _games.add(game);
    }
    public void DeleteRecord(Date date)
    {
        for(int i = 0; i < _games.size(); ++i)
            if(_games.get(i).GetDate() == date) {
                _games.remove(i);
                return;
            }
    }


    ArrayList<Games> _games;
}
