package com.awana.patrickrobichaud.awanamanager.Entity;

import com.awana.patrickrobichaud.awanamanager.Contact.ContactLeader;

import java.lang.ref.Reference;
import java.util.ArrayList;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Leader extends EntityBase implements IEntity {
    public String GetName()
    {
        return _name;
    }
    public Integer GetYearsOfService()
    {
        return _yearsOfService;
    }
    public ContactLeader GetContact()
    {
        return _contact;
    }
    public Group GetGroup()
    {
        return _group;
    }
    public Color GetColor()
    {
        return _color;
    }
    public ArrayList<Role> GetRole()
    {
        return _role;
    }
    public ArrayList<Reference<Clubber>> GetClubbers()
    {
        return _clubbers;
    }
    public Reference<Clubber> GetClubber(int index)
    {
        return _clubbers.get(index);
    }

    public void SetName(String name)
    {
        _name = name;
    }
    public void SetYearsOfService(Integer yearsOfService)
    {
        _yearsOfService = yearsOfService;
    }
    public void SetContact(ContactLeader contact)
    {
        _contact = contact;
    }
    public void SetGroup(Group group)
    {
        _group = group;
    }
    public void SetColor(Color color)
    {
        _color = color;
    }
    public void AddRole(Role role)
    {
        _role.add(role);
    }
    public void AddClubber(Reference<Clubber> clubber)
    {
        _clubbers.add(clubber);
    }

    public void DeleteRole(Integer index)
    {
        _role.remove(index);
    }

    public void IncrementYearsOfService()
    {
        _yearsOfService++;
    }

    protected String _name;
    protected Integer _yearsOfService;
    protected ContactLeader _contact;
    protected Group _group;
    protected Color _color;
    protected ArrayList<Role> _role;
    protected ArrayList<Reference<Clubber>> _clubbers;
}
