package com.mycompany.app.daos;

import com.mycompany.app.daos.interfaces.CustomerDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Address;
import com.mycompany.app.entities.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CustomerDaoJPAImpl implements CustomerDao{

    @PersistenceContext
    private EntityManager em;

    public Customer addInstance(Customer customer) {
        em.persist(customer);
        return customer;
    }

    public Customer getInstance(int id) {
        return em.find(Customer.class,id);
    }

}
