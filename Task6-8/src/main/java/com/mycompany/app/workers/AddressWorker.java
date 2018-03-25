package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.AddressDao;
import com.mycompany.app.daos.interfaces.NewsDao;
import com.mycompany.app.entities.Address;
import com.mycompany.app.entities.News;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressWorker {

    @Autowired
    AddressDao addressDao;

    public Address addAddress(Address address){
        address = addressDao.addInstance(address);
        return address;
    }
}
