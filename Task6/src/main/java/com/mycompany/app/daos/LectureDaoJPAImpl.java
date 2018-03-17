package com.mycompany.app.daos;

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

    public Lecture getInstance(int id) {
        return em.find(Lecture.class,id);
    }

}
