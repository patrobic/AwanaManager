package com.awana.patrickrobichaud.awanamanager.Record;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class AttendanceStore implements IRecordStore {
    public Attendance GetRecord(Date date)
    {
        // TODO search attendance for date
        for(int i = 0; i < _attendance.size(); ++i)
            if(_attendance.get(i).GetDate() == date)
                return _attendance.get(i);

        return null;
    }
    public int[] GetCumulativeRecord()
    {
        int att[] = { 0, 0, 0, 0 };
        for(int i = 0; i < _attendance.size(); ++i)
        {
             if(_attendance.get(i).GetPresent()) att[0]++;
             if(_attendance.get(i).GetBook()) att[1]++;
             if(_attendance.get(i).GetVest()) att[2]++;
             if(_attendance.get(i).GetSundaySchool()) att[3]++;
        }
        return att;
    }
    public void AddRecord(Attendance attendance)
    {
        _attendance.add(attendance);
    }
    public void DeleteRecord(Date date)
    {
        for(int i = 0; i < _attendance.size(); ++i)
            if(_attendance.get(i).GetDate() == date) {
                _attendance.remove(i);
                return;
            }
    }
    public Float CalculatePercentage()
    {
        int att[] = GetCumulativeRecord();
        Integer total = 0;

        for(int i = 0; i < 4; ++i)
            total += att[i];

        return (float)(total /= _attendance.size());
    }


    private ArrayList<Attendance> _attendance;
}
