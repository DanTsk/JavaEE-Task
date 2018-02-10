package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Instrumentalist implements Performer{
	public Instrumentalist() {}
	
	public void perform() {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
	
	private String song;
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public String getSong() {
		return song;
	}
	
	public String screamSong() {
		return song;
	}
	
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
		
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}
}
