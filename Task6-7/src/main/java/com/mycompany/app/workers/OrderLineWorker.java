package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.OrderDao;
import com.mycompany.app.daos.interfaces.OrderLineDao;
import com.mycompany.app.entities.Order;
import com.mycompany.app.entities.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderLineWorker {

    @Autowired
    OrderLineDao orderDao;

    public OrderLine addOrder(OrderLine order){
        order = orderDao.addInstance(order);
        return order;
    }
}
