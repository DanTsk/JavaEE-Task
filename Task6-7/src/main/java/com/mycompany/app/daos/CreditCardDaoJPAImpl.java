package com.mycompany.app.daos;


import com.mycompany.app.daos.interfaces.CdDao;
import com.mycompany.app.daos.interfaces.CreaditCardDao;
import com.mycompany.app.entities.CD;
import com.mycompany.app.entities.CreditCard;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CreditCardDaoJPAImpl implements CreaditCardDao {

    @PersistenceContext
    private EntityManager em;

    public CreditCard addInstance(CreditCard cc) {
        em.persist(cc);
        return cc;
    }

    public CreditCard getInstance(int id) {
        return em.find(CreditCard.class,id);
    }

}
