package com.spring.thirteen.StudentAnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration @ComponentScan(" com.spring.thirteen.StudentAnnotationBased")
public class App 
{
    public static void main( String[] args )
    {
    	
    	
      ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
      StudentBean sb=context.getBean(StudentBean.class);
      sb.display();
      
    }
}
