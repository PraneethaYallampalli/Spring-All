package com.spring.eight.CollectionOfObjects;

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
        AmeerpetTechnologies at=(AmeerpetTechnologies) context.getBean("institute");
        at.print();
    }
}
