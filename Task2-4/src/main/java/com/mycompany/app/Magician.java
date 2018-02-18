package com.mycompany.app;

public class Magician implements MindReader{
	private String thoughts;

	public void interceptThoughts(String thoughts){
		System.out.println("Intercepting volunteers's thoughts");
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}

}
