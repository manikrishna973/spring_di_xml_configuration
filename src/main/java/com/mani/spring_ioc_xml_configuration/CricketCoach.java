package com.mani.spring_ioc_xml_configuration;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;

	private String team;

	public CricketCoach() {
		System.out.println(
				"CricketCoach: in no-arg constructor, spring uses this to create bean/instance of CricketCoach");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In CricketCoach: Injecting dependency Using setter -> setFortuneService");
		this.fortuneService = fortuneService;
	}

	// -- inject literal values --
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach:Inject Literal - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:Inject Literal - setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast Bowling and wicket Keeping 30mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
