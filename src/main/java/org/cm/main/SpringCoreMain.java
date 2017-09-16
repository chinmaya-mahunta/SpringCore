package org.cm.main;

import org.cm.beans.Resturant;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringCoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Resource resource = new ClassPathResource("SpringConfig.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		Resturant resturant = (Resturant) beanFactory.getBean("resturant");
		resturant.takeOrder();*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Resturant resturant = (Resturant) context.getBean("resturant");
		resturant.takeOrder();
		
	}

}
