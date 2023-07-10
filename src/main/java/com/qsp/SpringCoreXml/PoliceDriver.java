package com.qsp.SpringCoreXml;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PoliceDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	XmlBeanFactory bfact=new XmlBeanFactory(cpr);
	Police p=(Police)bfact.getBean("police");
	System.out.println(p.getId());
	System.out.println(p.getBranch());
	System.out.println(p.getThief());
}
}
