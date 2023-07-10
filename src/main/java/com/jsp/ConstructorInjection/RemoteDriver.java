package com.jsp.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class RemoteDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("my.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Remote r=(Remote)bf.getBean("myremote");
	System.out.println(r.id);
	System.out.println(r.brand);
	System.out.println(r.b);
	Battery b=r.b;// B is battery type data and store the inside b and i can call the m1 method;
	b.m1();
}
}
