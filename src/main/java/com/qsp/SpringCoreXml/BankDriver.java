package com.qsp.SpringCoreXml;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BankDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	XmlBeanFactory bfact=new XmlBeanFactory(cpr);
	Bank b=(Bank)bfact.getBean("bank");
	System.out.println(b.getId());
	System.out.println(b.getBname());
	System.out.println(b.getCustormers());
}
}
