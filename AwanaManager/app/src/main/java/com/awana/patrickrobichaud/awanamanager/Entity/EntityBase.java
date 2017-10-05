package com.awana.patrickrobichaud.awanamanager.Entity;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public abstract class EntityBase implements IEntity {
    public Integer GetDbId()
    {
        return _id;
    }

    public void SetDbId(Integer id)
    {
        _id = id;
    }

    protected Integer _id;
}
