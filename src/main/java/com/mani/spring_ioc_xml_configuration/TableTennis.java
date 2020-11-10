package com.mani.spring_ioc_xml_configuration;

public class TableTennis implements Coach{

	
	private FortuneService forturneService; //dependency=helper
	
	
	
	public TableTennis(FortuneService forturneService) {
		this.forturneService = forturneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice two hours everyday";
	}

	@Override
	public String getDailyFortune() {
		return forturneService.getDailyFortune();
	}

}
