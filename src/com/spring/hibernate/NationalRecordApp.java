package com.spring.hibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class NationalRecordApp {

	public static void main(String... args){
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		NationalRecordDAOIfc nationalDAO=(NationalRecordDAOIfc)factory.getBean("daoBean");
		Passport passport=new Passport();
		passport.setPassID(12345);
		passport.setCountry("India");
		National national=new National();
		national.setName("Aakash");
		national.setPassportDetails(passport);
		nationalDAO.saveNational(national);
	}
}