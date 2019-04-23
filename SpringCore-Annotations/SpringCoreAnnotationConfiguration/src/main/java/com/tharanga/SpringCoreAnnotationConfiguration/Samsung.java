package com.tharanga.SpringCoreAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //By default it will give the object
public class Samsung {
	
	@Autowired   //it will check for the Object
	@Qualifier("snapDragon")  //which one u want to print mention inside the qualifier
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Samsung Configuration");
		cpu.process();
	}

}
