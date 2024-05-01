package com.spring.third.Empolyee;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    /*public static void main( String[] args )
    {
    	  Resource res=new ClassPathResource("springconfig.xml");
    	  XmlBeanFactory factory= new XmlBeanFactory(res);
    	  EmployeeClass myBean=(EmployeeClass) factory.getBean("employee");
    	  myBean.print();

    	}*/
	public static void main( String[] args )
    {
    	  Resource res=new FileSystemResource("springconfig.xml");
    	  XmlBeanFactory factory= new XmlBeanFactory(res);
    	  EmployeeClass myBean=(EmployeeClass) factory.getBean("employee");
    	  myBean.print();

    	}
}
