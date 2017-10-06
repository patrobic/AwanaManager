package com.awana.patrickrobichaud.awanamanager.Record;

import java.util.Date;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Attendance implements IRecord {
    public Date GetDate()
    {
        return _date;
    }
    public Boolean GetPresent()
    {
        return _present;
    }
    public Boolean GetBook()
    {
        return _book;
    }
    public Boolean GetVest()
    {
        return _vest;
    }
    public Boolean GetSundaySchool()
    {
        return _sundaySchool;
    }
    public String GetNote()
    {
        return _note;
    }

    public void SetDate(Date date)
    {
        _date = date;
    }
    public void SetPresent(Boolean present)
    {
        _present = present;
    }
    public  void SetVest(Boolean vest)
    {
        _vest = vest;
    }
    public void SetSundaySchool(Boolean sundaySchool)
    {
        _sundaySchool = sundaySchool;
    }
    public void SetNote(String note)
    {
        _note = note;
    }

    private Date _date;
    private Boolean _present;
    private Boolean _book;
    private Boolean _vest;
    private Boolean _sundaySchool;
    private String _note;
}
