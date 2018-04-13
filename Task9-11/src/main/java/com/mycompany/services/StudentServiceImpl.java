package com.mycompany.services;

import com.mycompany.data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentsDao;

    public Student addStudent(Student student) {
        if (student==null)
            return null;
        return studentsDao.addStudent(student);
    }

    public Student getStudentById(int studentId) {
        if (studentId==0)
            return null;
        return studentsDao.getStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentsDao.getAllStudents();
    }

    public Student getStudentByPIB(String pib) {
        if ((pib == null)||("".equals(pib)))
            return null;
        return studentsDao.getStudentByPIB(pib);
    }

    public List<Student> getAllStudentsByCourse(int course) {
        if (course==0)
            return null;
        return studentsDao.getAllStudentsByCourse(course);
    }

    public void saveStudent(Student student) {
        if (student == null)
            return;
        studentsDao.saveStudent(student);
    }
}
