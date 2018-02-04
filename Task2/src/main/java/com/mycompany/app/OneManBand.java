package com.mycompany.app;

import java.util.Collection;

public class OneManBand implements Performer{
	private Collection<Instrument> instruments;	
	
	public OneManBand(){}
	
	public void perform(){
		for (Instrument instrument:instruments){
			instrument.play();
		}
	}	
	
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments = instruments;
	}
}

