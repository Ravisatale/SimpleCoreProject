package com.jsp.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("my.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Car c= (Car)bf.getBean("mycar");
	System.out.println(c.id);
	System.out.println(c.brand);
	System.out.println(c.price);
	Engine e=c.e;
	e.m1();
}
}
