package com.mani.spring_ioc_xml_configuration;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private Random random = new Random();
	String[] fortuneData= {"Your Lucky Day", "Learns spring framework","can earn more money today"};
	
	
	
	
	@Override
	public String getDailyFortune() {
		int index=this.random.nextInt(fortuneData.length);
		String randomFortune = fortuneData[index];
		
		return randomFortune;
	}

}
