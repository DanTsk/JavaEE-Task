package com.mycompany.app.daos;

import com.mycompany.app.daos.interfaces.AddressDao;
import com.mycompany.app.daos.interfaces.ArtistDao;
import com.mycompany.app.entities.Address;
import com.mycompany.app.entities.Artist;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ArtistDaoJPAImpl implements ArtistDao {

    @PersistenceContext
    private EntityManager em;

    public Artist addInstance(Artist art) {
        em.persist(art);
        return art;
    }

    public Artist getInstance(int id) {
        return em.find(Artist.class,id);
    }

}
