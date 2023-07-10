package com.qsp.SpringCoreXml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PencilDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	BeanFactory bf= new XmlBeanFactory(cpr);
	Pencil p=(Pencil)bf.getBean("mypencil");
	Eraser e=(Eraser)bf.getBean("myeraser");
	p.pencilid();
	e.era();
}
}
