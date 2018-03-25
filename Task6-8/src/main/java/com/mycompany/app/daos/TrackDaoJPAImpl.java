package com.mycompany.app.daos;

import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.daos.interfaces.TrackDao;
import com.mycompany.app.entities.News;
import com.mycompany.app.entities.Track;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class TrackDaoJPAImpl implements TrackDao{

    @PersistenceContext
    private EntityManager em;

    public Track addInstance(Track track) {
        em.persist(track);
        return track;
    }

    public Track getInstance(int id) {
        return em.find(Track.class,id);
    }

}
