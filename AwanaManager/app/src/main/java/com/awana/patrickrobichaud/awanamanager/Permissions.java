package com.awana.patrickrobichaud.awanamanager;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Permissions {
    public Boolean CanRead(Module module, Group group, Date date)
    {

    }

    public Boolean CanWrite(Module module, Group group, Date date)
    {

    }

    public Boolean CanManage(Module module)
    {

    }

    public void SetRead(Module module, Group group, Date date)
    {

    }

    public void SetWrite(Module module, Group group, Date date)
    {

    }

    public void SetManage(Module module)
    {

    }

    private void GetPermissions(Level level, Module module, Group group, Week week, Boolean manage)
    {
        // breakdown & return int flag parameters
    }
    private  Integer SetPermissions(Level level, Module module, Group group, Week week, Boolean manage)
    {
        // calculate & set int flag
    }


    private Integer _permissions;
}
