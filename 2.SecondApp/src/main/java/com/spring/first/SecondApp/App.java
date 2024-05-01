package com.spring.first.SecondApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
        
        Resource res = new ClassPathResource("springcofig2.xml");
        
        
        XmlBeanFactory factory = new XmlBeanFactory(res);
        
        
        EmployeeClass employee = (EmployeeClass) context.getBean("employee");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Department Number: " + employee.getDeptno());
        System.out.println("Employee Date of Joining: " + employee.getDoj());
        

    }
}
