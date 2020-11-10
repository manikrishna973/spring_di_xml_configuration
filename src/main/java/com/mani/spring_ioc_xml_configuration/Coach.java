package com.mani.spring_ioc_xml_configuration;

public interface Coach {

	public String getDailyWorkout();
	
	public String getDailyFortune(); //Now coach  provides new functionality fortune by using a helper class(DI) "fortune service"
	
}
