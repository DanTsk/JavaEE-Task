package com.mycompany.app.daos;

import com.mycompany.app.daos.interfaces.AddressDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Address;
import com.mycompany.app.entities.Lecture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class AddressDaoJPAImpl implements AddressDao {

    @PersistenceContext
    private EntityManager em;

    public Address addInstance(Address address) {
        em.persist(address);
        return address;
    }

    public Address getInstance(int id) {
        return em.find(Address.class,id);
    }

}
