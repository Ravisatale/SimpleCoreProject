package com.qsp.SpringCoreXml;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	XmlBeanFactory bfact=new XmlBeanFactory(cpr);
	Employee e=(Employee)bfact.getBean("employee");
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getSal());
}
}
