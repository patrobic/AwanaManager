package com.awana.patrickrobichaud.awanamanager.Entity;

import com.awana.patrickrobichaud.awanamanager.Contact.ContactClubber;
import com.awana.patrickrobichaud.awanamanager.Contact.ContactLeader;
import com.awana.patrickrobichaud.awanamanager.Record.Attendance;
import com.awana.patrickrobichaud.awanamanager.Record.AttendanceStore;

import java.lang.ref.Reference;
import java.util.ArrayList;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Clubber extends EntityBase implements IEntity {
    public String GetName()
    {
        return _name;
    }
    public Integer GetAge()
    {
        return _age;
    }
    public ContactClubber GetContact()
    {
        return _contact;
    }
    public Float GetPaymentBalance()
    {
        return _paymentBalance;
    }
    public Group GetGroup()
    {
        return _group;
    }
    public Color GetColor()
    {
        return _color;
    }
    public AttendanceStore GetAttendanceStore()
    {
        return _attendanceStore;
    }
    public Reference<Leader> GetLeader()
    {
        return _leader;
    }

    public void SetName(String name)
    {
        _name = name;
    }
    public void SetAge(Integer age)
    {
        _age = age;
    }
    public void SetContact(ContactClubber contact)
    {
        _contact = contact;
    }
    public void SetPaymentBalance(Float paymentBalance)
    {
        _paymentBalance = paymentBalance;
    }
    public void SetGroup(Group group)
    {
        _group = group;
    }
    public void SetColor(Color color)
    {
        _color = color;
    }
    public void SetAttendanceStore(AttendanceStore attendanceStore)
    {
        _attendanceStore = attendanceStore;
    }

    protected String _name;
    protected Integer _age;
    protected ContactClubber _contact;
    protected Float _paymentBalance;
    protected Group _group;
    protected Color _color;
    protected AttendanceStore _attendanceStore;
    protected Reference<Leader> _leader;
}
