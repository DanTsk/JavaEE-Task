package com.mycompany.app.daos;


import com.mycompany.app.daos.interfaces.OrderDao;
import com.mycompany.app.entities.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class OrderDaoJPAImpl implements OrderDao {

    @PersistenceContext
    private EntityManager em;

    public Order addInstance(Order ord) {
        em.persist(ord);
        return ord;
    }
    public Order getInstance(int id) {
        return em.find(Order.class,id);
    }
}
