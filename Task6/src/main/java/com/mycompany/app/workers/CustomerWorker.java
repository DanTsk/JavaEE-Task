package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.CustomerDao;
import com.mycompany.app.daos.interfaces.LectureDao;
import com.mycompany.app.entities.Customer;
import com.mycompany.app.entities.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerWorker {

    @Autowired
    CustomerDao customerDao;

    public Customer addCustomer(Customer customer){
        customer = customerDao.addInstance(customer);
        return customer;
    }
}
