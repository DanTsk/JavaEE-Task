package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.CreaditCardDao;
import com.mycompany.app.daos.interfaces.CustomerDao;
import com.mycompany.app.entities.CreditCard;
import com.mycompany.app.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CreditCardWorker {

    @Autowired
    CreaditCardDao cd;

    public CreditCard addCustomer(CreditCard cc){
        cc = cd.addInstance(cc);
        return cc;
    }
}
