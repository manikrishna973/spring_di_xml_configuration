package com.mani.spring_ioc_xml_configuration;

public class SchoolServiceImpl implements SchoolService{

	
	//helper classes 1.FortuneService 2.Coach
	
	private FortuneService fortuneService;
	private Coach theCoach;
	
	//Multi arg Constructor injection
	public SchoolServiceImpl(FortuneService fortuneService, Coach theCoach) {
		this.fortuneService = fortuneService;
		this.theCoach = theCoach;
	}
	
	
	@Override
	public String greetStudents() {
		return "Welcome Dear Students..";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyWorkOut() {
		return theCoach.getDailyWorkout();
	}

}
