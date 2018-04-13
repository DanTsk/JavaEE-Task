package com.mycompany.services;

import com.mycompany.data.Student;

import java.util.List;

public interface StudentDao {
    Student addStudent(Student student);
    Student getStudentById(int studentId);
    List<Student> getAllStudents();
    Student getStudentByPIB(String pib);
    List<Student> getAllStudentsByCourse(int course);
    void saveStudent(Student student);
}
