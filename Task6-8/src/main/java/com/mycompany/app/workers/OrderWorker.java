package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.AddressDao;
import com.mycompany.app.daos.interfaces.OrderDao;
import com.mycompany.app.entities.Address;
import com.mycompany.app.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderWorker {

    @Autowired
    OrderDao orderDao;

    public Order addOrder(Order order){
        order = orderDao.addInstance(order);
        return order;
    }
}
