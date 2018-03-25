package com.mycompany.app.embeddables;


import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class NewsId implements Serializable {
    private String title;
    private String language;

    public NewsId(){}

    public  NewsId(String title, String language){
        this.title = title;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof NewsId)) return false;

        NewsId other = (NewsId) obj;

        return this.title.equals(other.title) && this.language.equals(other.language);
    }

    @Override
    public int hashCode() {
        return this.language.hashCode() + this.language.hashCode();
    }


}
