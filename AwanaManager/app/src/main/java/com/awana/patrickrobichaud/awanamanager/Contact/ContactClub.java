package com.awana.patrickrobichaud.awanamanager.Contact;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class ContactClub extends ContactBase implements IContact {
    public String GetName()
    {
        return _churchName;
    }
    public Integer GetCapacity()
    {
        return _churchCapacity;
    }

    public void SetName(String name)
    {
        _churchName = name;
    }
    public void SetCapacity(Integer capacity)
    {
        _churchCapacity = capacity;
    }

    protected String _churchName;
    protected Integer _churchCapacity;
}
