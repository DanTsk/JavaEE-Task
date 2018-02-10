package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Saxophonist {
	private Saxophone instrument;	
	
	@Autowired
	public Saxophonist(Saxophone instrument){
		this.instrument = instrument;
	}
	
	void play(){
		this.instrument.play();
	}
}
