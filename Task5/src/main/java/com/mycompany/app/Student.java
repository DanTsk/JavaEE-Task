package com.mycompany.app;

public class Student {
	private int studentId;
	private String pib;
	private int course;


	public Student(String pib, int course){	
		this.pib = pib;
		this.course = course;
	}
	
	public Student(){}
	
	public String getPib(){
		return this.pib;
	}
	
	public int getCourse(){
		return this.course;
	}
	
	public int getId(){
		return this.studentId;
	}
	
	public void setStudentId(int id){
		this.studentId = id;
	}
	
	public void setPib(String pib){
		this.pib = pib;
	}
	
	public void setCourse(int course){
		this.course = course;
	}
	
	public String toString(){
		return this.studentId + " " + this.pib + " " + this.course;
	}

}
