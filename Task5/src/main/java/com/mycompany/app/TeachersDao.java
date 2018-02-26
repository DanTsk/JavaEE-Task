package com.mycompany.app;

public interface TeachersDao {
	void addTeacher(Teacher teacher);	
	void saveTacher(Teacher teacher);
	
	Teacher getTeacherById(int id);
}
