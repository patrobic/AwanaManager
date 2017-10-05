package com.awana.patrickrobichaud.awanamanager.Contact;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class ContactLeader extends ContactBase implements IContact {
    public Integer[] GetOffspring()
    {
        return _offspringIds;
    }

    public void SetOffspring(Integer offspringID)
    {
        _offspringIds[_offspringCount++] = offspringID;
    }

    protected Integer _offspringIds[];
    protected Integer _offspringCount;
}
