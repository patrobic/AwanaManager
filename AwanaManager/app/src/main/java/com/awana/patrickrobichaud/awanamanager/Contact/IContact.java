package com.awana.patrickrobichaud.awanamanager.Contact;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public interface IContact {
    String GetAddress();
    String GetCity();
    String GetPostalCode();
    String GetCountry();
    String GetPhoneNumber();
    String GetEmail();

    void SetAddress(String address);
    void SetCity(String city);
    void SetPostalCode(String postalCode);
    void SetCountry(String country);
    void SetPhoneNumber(String phoneNumber);
    void SetEmail(String email);
}
