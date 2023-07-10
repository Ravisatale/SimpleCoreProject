package com.jsp.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver {
 public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("my.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
    Student s=(Student) bf.getBean("mystudent");
    System.out.println(s.id);
    System.out.println(s.name);
    System.out.println(s.age);
}
}
