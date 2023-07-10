package DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BagDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("my.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Bag b1=(Bag)bf.getBean("bag");
	System.out.println(b1);
	//System.out.println(b1.brand);
	System.out.println(b1.b);
	
}
}
