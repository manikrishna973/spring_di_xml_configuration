package com.mani.spring_ioc_xml_configuration;

public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Its your Lucky day!!!";
	}

}
