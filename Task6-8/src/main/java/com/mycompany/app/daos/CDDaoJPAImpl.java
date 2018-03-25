package com.mycompany.app.daos;


import com.mycompany.app.daos.interfaces.CdDao;
import com.mycompany.app.entities.CD;
import com.mycompany.app.entities.CD;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CDDaoJPAImpl implements CdDao {

    @PersistenceContext
    private EntityManager em;

    public CD addInstance(CD cd) {
        em.persist(cd);
        return cd;
    }

    public CD getInstance(int id) {
        return em.find(CD.class,id);
    }

}
