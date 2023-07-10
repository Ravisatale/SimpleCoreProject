package com.qsp.SpringCoreXml;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	XmlBeanFactory bfact=new XmlBeanFactory(cpr);
     Student s=(Student)bfact.getBean("student");
     System.out.println(s.getId());
     System.out.println(s.getName());
     System.out.println(s.getAge());
}
}
