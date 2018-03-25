package com.mycompany.app.daos;

import com.mycompany.app.daos.interfaces.NewsDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.News;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class NewsDaoJPAImpl implements NewsDao{

    @PersistenceContext
    private EntityManager em;

    public News addInstance(News news) {
        em.persist(news);
        return news;
    }

    public News getInstance(int id) {
        return em.find(News.class,id);
    }

}
