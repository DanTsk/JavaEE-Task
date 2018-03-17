package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.CdDao;
import com.mycompany.app.entities.CD;
import org.springframework.beans.factory.annotation.Autowired;

public class CdWorker {

    @Autowired
    CdDao cdDao;

    public CD addCD(CD cd){
        cd = cdDao.addInstance(cd);
        return cd;
    }
}
