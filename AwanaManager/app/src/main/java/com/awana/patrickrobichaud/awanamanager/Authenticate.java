package com.awana.patrickrobichaud.awanamanager;

import com.awana.patrickrobichaud.awanamanager.Entity.Leader;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Authenticate {
    public Boolean Exists(String username)
    {

    }
    public Leader Login(Credentials credentials)
    {

    }
    public Boolean Preapproved(String username)
    {

    }
    public Boolean Create(Credentials credentials)
    {

    }

    public DbConfig GetDbConfig()
    {
        return _dbConfig;
    }
    public void SetDbConfig(DbConfig dbConfig)
    {
        _dbConfig = dbConfig;
    }

    private DbConfig _dbConfig;
}
