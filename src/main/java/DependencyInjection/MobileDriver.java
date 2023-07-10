package DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("core.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Mobile m=(Mobile)bf.getBean("myphone");
	System.out.println(m);
	System.out.println(m.getB());
	
}
}
