package com.awana.patrickrobichaud.awanamanager.Contact;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class ContactBase implements IContact {
    public String GetAddress()
    {
        return _address;
    }
    public String GetCity()
    {
        return _city;
    }
    public String GetPostalCode()
    {
        return _postalCode;
    }
    public String GetCountry()
    {
        return  _country;
    }
    public String GetPhoneNumber()
    {
        return _phoneNumber;
    }
    public String GetEmail() { return _email; }

    public void SetAddress(String address) { _address = address; }
    public void SetCity(String city)
    {
        _city = city;
    }
    public void SetPostalCode(String postalCode)
    {
        _postalCode = postalCode;
    }
    public void SetCountry(String country)
    {
        _country = country;
    }
    public void SetPhoneNumber(String phoneNumber)
    {
        _phoneNumber = phoneNumber;
    }
    public void SetEmail(String email)
    {
        _email = email;
    }


    protected String _address;
    protected String _city;
    protected String _postalCode;
    protected String _country;
    protected String _phoneNumber;
    protected String _email;
}
