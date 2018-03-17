package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.BookDao;
import com.mycompany.app.daos.interfaces.LectureDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Query;
import java.util.List;

public class LecturesWorker {

    @Autowired
    LectureDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addInstance(lecture);
        return lecture;
    }

    public Lecture getLecture(int id){
        return lecturesDao.getInstance(id);
    }

    public List<Lecture> getAll(){
        return lecturesDao.getAll();
    }

    public List<Double> getAllCredits(){
        return lecturesDao.getAllCredits();
    }
}
