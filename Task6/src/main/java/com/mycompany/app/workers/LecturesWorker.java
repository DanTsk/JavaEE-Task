package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.BookDao;
import com.mycompany.app.daos.interfaces.LectureDao;
import com.mycompany.app.daos.interfaces.StandartDao;
import com.mycompany.app.entities.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {

    @Autowired
    LectureDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addInstance(lecture);
        return lecture;
    }
}
