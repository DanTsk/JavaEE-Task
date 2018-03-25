package com.mycompany.app.daos.interfaces;

import com.mycompany.app.entities.Lecture;

import java.util.List;


public interface LectureDao extends StandartDao<Lecture>{

    public List<Lecture> getAll();
    public List<Double> getAllCredits();
};
