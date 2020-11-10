package com.mani.spring_ioc_xml_configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) 
	{
		// create the object
		Coach theCoach = new BaseballCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
		
		
	}
}
