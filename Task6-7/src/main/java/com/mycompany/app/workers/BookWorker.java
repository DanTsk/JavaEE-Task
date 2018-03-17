package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.BookDao;
import com.mycompany.app.daos.interfaces.NewsDao;
import com.mycompany.app.entities.Book;
import com.mycompany.app.entities.News;
import org.springframework.beans.factory.annotation.Autowired;

public class BookWorker {

    @Autowired
    BookDao bookDao;

    public Book addBook(Book book){
        book = bookDao.addInstance(book);
        return book;
    }
}
