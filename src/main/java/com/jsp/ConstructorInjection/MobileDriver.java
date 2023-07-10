package com.jsp.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {
 public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("my.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Mobile m=(Mobile)bf.getBean("mymobile");
	System.out.println(m.id);
	System.out.println(m.brand);
	Sim s=m.s;
	s.m1();
}
}
