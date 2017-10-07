package com.awana.patrickrobichaud.awanamanager;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Credentials {
    public String GetUsername()
    {
        return _username;
    }
    public String GetPassword()
    {
        return _password;
    }
    public Permissions GetPermissions()
    {
        return _permissions;
    }
    public Integer GetClubId()
    {
        return _clubId;
    }
    public Integer GetLeaderId()
    {
        return _leaderId;
    }

    public void SetUsername(String username)
    {
        _username = username;
    }
    public void SetPassword(String password)
    {
        _password = password;
    }
    public void SetPermissions(Permissions permissions)
    {
        _permissions = permissions;
    }
    public void SetClubId(Integer clubId)
    {
        _clubId = clubId;
    }
    public void SetLeaderId(Integer leaderId)
    {
        _leaderId = leaderId;
    }

    private String _username;
    private String _password;
    private Permissions _permissions;
    private Integer _clubId;
    private Integer _leaderId;
}
