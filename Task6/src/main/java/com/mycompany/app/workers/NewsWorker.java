package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.CustomerDao;
import com.mycompany.app.daos.interfaces.NewsDao;
import com.mycompany.app.entities.Customer;
import com.mycompany.app.entities.News;
import org.springframework.beans.factory.annotation.Autowired;

public class NewsWorker {

    @Autowired
    NewsDao newsDao;

    public News addNews(News news){
        news = newsDao.addInstance(news);
        return news;
    }
}
