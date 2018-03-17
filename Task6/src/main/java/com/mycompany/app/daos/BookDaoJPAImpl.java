package com.mycompany.app.daos;

import com.mycompany.app.daos.interfaces.BookDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Book;
import com.mycompany.app.entities.Track;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class BookDaoJPAImpl implements BookDao {

    @PersistenceContext
    private EntityManager em;

    public Book addInstance(Book book) {
        em.persist(book);
        return book;
    }

    public Book getInstance(int id) {
        return em.find(Book.class,id);
    }

}
