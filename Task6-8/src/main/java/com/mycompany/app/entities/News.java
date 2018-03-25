package com.mycompany.app.entities;

import com.mycompany.app.embeddables.NewsId;

import javax.persistence.*;

@Entity
public class News {
    @EmbeddedId
    private NewsId id;
    private String content;

    public News(NewsId id, String content){
        this.id = id;
        this.content = content;
    }

    public News() {
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NewsId getId() {
        return id;
    }

    public void setId(NewsId id) {
        this.id = id;
    }
}
