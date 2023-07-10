package com.qsp.SpringCoreXml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BikeDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	BeanFactory bfact= new XmlBeanFactory(cpr);
	Bike b =(Bike)bfact.getBean("mybike");
	Pen p=(Pen)bfact.getBean("mypen");
	IceCream ic=(IceCream)bfact.getBean("myice");
	b.bikeride();
	p.penid();
	ic.ice();
}
}
