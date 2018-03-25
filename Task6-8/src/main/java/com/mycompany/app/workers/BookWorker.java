package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.BookDao;
import com.mycompany.app.daos.interfaces.NewsDao;
import com.mycompany.app.entities.Book;
import com.mycompany.app.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BookWorker {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public Book addBook(final Book book){
        transactionTemplate.execute(new TransactionCallback<Void>(){
            public Void doInTransaction(TransactionStatus txStatus){
                try{
                    bookDao.addInstance(book);
                    System.out.println("Book was added "+bookDao);
                }catch (RuntimeException e){
                    txStatus.setRollbackOnly();
                    throw e;
                }
                return null;
            }
        });
        return book;
    }
}
