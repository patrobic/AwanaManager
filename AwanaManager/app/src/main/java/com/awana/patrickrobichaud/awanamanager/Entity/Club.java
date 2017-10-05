package com.awana.patrickrobichaud.awanamanager.Entity;

import com.awana.patrickrobichaud.awanamanager.Contact.ContactBase;
import com.awana.patrickrobichaud.awanamanager.Contact.ContactClub;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Club extends EntityBase {
    public ContactClub GetContact()
    {
        return _contact;
    }
    public ContactBase GetChurchContact()
    {
        return _contactChurch;
    }

    public void SetContect(ContactClub contact)
    {
        _contact = contact;
    }
    public void SetChurchContact(ContactBase contact)
    {
        _contactChurch = contact;
    }

    private ContactClub _contact;
    private ContactBase _contactChurch;
}
