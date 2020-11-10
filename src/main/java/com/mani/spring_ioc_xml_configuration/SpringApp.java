package com.mani.spring_ioc_xml_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		SchoolService theSchool = context.getBean("theSchool", SchoolService.class); // cast's its implementation class
																						// behind the scenes

		// call methods on the bean
		System.out.println("coach DailyWorkOut:" + theCoach.getDailyWorkout());

		System.out.println("coach DailyFortune:" + theCoach.getDailyFortune());

		System.out.println();

		// call methods on school bean which greets students,provides fortune and
		// daily-work-out service

		System.out.println("school:" + theSchool.greetStudents());

		System.out.println("school:" + theSchool.getDailyWorkOut());

		System.out.println("school :" + theSchool.getDailyFortune());

		// close the context
		context.close();
	}

}
