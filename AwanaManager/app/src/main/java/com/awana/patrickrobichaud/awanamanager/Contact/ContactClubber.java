package com.awana.patrickrobichaud.awanamanager.Contact;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class ContactClubber extends ContactBase implements IContact {
    public String GetFathersName()
    {
        return _fathersName;
    }
    public String GetMothersName()
    {
        return _mothersName;
    }
    public String GetFathersPhNum()
    {
        return  _fathersPhNum;
    }
    public String GetMothersPhNum()
    {
        return _mothersPhNum;
    }

    public void SetFathersName(String name)
    {
        _fathersName = name;
    }
    public void SetMothersName(String name)
    {
        _mothersName = name;
    }
    public void SetFathersPhNum(String num)
    {
        _fathersPhNum = num;
    }
    public void SetMothersPhNum(String num)
    {
        _mothersPhNum = num;
    }

    protected String _fathersName;
    protected String _mothersName;
    protected String _fathersPhNum;
    protected String _mothersPhNum;
}
