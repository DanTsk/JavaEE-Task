package com.mycompany.app.daos;


import com.mycompany.app.daos.interfaces.OrderDao;
import com.mycompany.app.daos.interfaces.OrderLineDao;
import com.mycompany.app.entities.Order;
import com.mycompany.app.entities.OrderLine;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class OrderLinesDaoJPAImpl implements OrderLineDao {

    @PersistenceContext
    private EntityManager em;

    public OrderLine addInstance(OrderLine ord) {
        em.persist(ord);
        return ord;
    }
    public OrderLine getInstance(int id) {
        return em.find(OrderLine.class,id);
    }
}
