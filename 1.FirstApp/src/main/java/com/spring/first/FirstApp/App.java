package com.spring.first.FirstApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource res=new ClassPathResource("springconfig.xml");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        BeanClass myBean = (BeanClass) factory.getBean("add");

        myBean.printAddition();
    }
}
