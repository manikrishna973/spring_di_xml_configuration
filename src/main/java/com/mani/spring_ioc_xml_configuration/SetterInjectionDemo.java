package com.mani.spring_ioc_xml_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);


		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods -Load Literal values(hard-coded)
		//System.out.println(theCoach.getEmailAddress());
		
		//System.out.println(theCoach.getTeam());
		
		
		//To inject values from properties file
		//1.create a property file
		//2.Load the properties file : cricketapp.properties in configuration file
		//refer the values of properties file
		
	    System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		

	}
}
