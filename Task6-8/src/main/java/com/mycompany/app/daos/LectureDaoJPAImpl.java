package com.mycompany.app.daos;

import com.googlecode.ehcache.annotations.Cacheable;
import com.mycompany.app.daos.interfaces.LectureDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Lecture;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class LectureDaoJPAImpl implements LectureDao {

    @PersistenceContext
    private EntityManager em;

    public Lecture addInstance(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    @Cacheable(cacheName = "lecturesCache")
    public Lecture getInstance(int id) {
        System.out.println("Find was called, ID = " + id);
        return em.find(Lecture.class,id);
    }

    public List<Lecture> getAll(){
        Query query = em.createQuery("SELECT c FROM Lecture c", Lecture.class);
        return query.getResultList();
    }

    public List<Double> getAllCredits(){
        Query query = em.createNamedQuery("findAllCredits");
        return query.getResultList();
    }
}
