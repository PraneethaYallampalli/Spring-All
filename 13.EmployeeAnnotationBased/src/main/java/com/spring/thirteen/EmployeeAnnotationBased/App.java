package com.spring.thirteen.EmployeeAnnotationBased;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration @ComponentScan("com.spring.thirteen.EmployeeAnnotationBased")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
       EmployeeBean eb=context.getBean(EmployeeBean.class);
       eb.display();
    }
}
