package com.mycompany.app;

import org.aspectj.lang.annotation.*;

@Aspect
public class Car {

	
	public Car(){}
	
	
	@Pointcut("execution(* com.mycompany.app.Driver.drive(..))")
	public void info(){}

	@Before("info()")
	public void getFuel(){
		System.out.println("Car info: The car was filled with fuel");
	}
	@Before("info()")
	public void startEngine(){
		System.out.println("Car info: Engine was successfully started");
	}
	
	@AfterReturning("info()")
	public void drive(){
		System.out.println("Car info: Car stopped, trip is ended");
	}
	
	@AfterThrowing("info()")
	public void crash(){
		System.out.println("Car info: Whooops ! Unexpected crash");
	}
	
}
