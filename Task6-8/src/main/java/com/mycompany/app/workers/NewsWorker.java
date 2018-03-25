package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.CustomerDao;
import com.mycompany.app.daos.interfaces.NewsDao;
import com.mycompany.app.entities.Customer;
import com.mycompany.app.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation= Propagation.SUPPORTS, readOnly = true)
public class NewsWorker {

    @Autowired
    NewsDao newsDao;

    @Transactional(propagation=Propagation.REQUIRED, readOnly=true)
    public News addNews(News news){
        news = newsDao.addInstance(news);
        return news;
    }
}
