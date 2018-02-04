package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		
		System.out.println("\n\n");
		
		Performer performer = (Performer)context.getBean("duke");
		performer.perform();
		
		System.out.println("\n\n");
		
		PoeticJuggler p1 = (PoeticJuggler)context.getBean("poeticDuke");
		p1.perform();
		
		System.out.println("\n\n");
		
		Stage s1 = (Stage)context.getBean("theStage");
		
		System.out.println("\n\n");
		
		Instrumentalist kenny = (Instrumentalist)context.getBean("kenny");
		kenny.perform();
		
		System.out.println("\n\n");
		
		PoeticJuggler p2 = (PoeticJuggler)context.getBean("poeticDuke2");
		p2.perform();
		
		System.out.println("\n\n");
		
		OneManBand hank = (OneManBand)context.getBean("hank");
		hank.perform();
	}

	
}
