package com.spring.seven.FormOfCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        AmeerpetTechnologiesBean atBean=(AmeerpetTechnologiesBean)context.getBean("institute");
        atBean.print();
    }

}