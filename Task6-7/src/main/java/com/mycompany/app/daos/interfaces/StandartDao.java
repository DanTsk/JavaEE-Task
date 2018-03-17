package com.mycompany.app.daos.interfaces;

public interface StandartDao<T>{
    T addInstance(T inst);
    T getInstance(int id);
}
