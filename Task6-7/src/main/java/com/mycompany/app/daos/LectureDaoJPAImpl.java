package com.mycompany.app.daos;

import com.googlecode.ehcache.annotations.Cacheable;
import com.mycompany.app.daos.interfaces.LectureDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Lecture;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
