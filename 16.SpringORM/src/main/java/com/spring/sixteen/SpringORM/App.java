package com.spring.sixteen.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.sixteen.SpringORM.dao.EmployeeDao;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        EmployeeDao dao=(EmployeeDao) context.getBean("empDao");
        EmployeeBean emp =new EmployeeBean();
		
		/*
		 * emp.setId(101); emp.setName("prani"); emp.setSalary(45000.50);
		 * emp.setId(102); emp.setName("lucky"); emp.setSalary(50000.00);
		 * emp.setId(103); emp.setName("mom"); emp.setSalary(60000.00);
		 * 
		 * dao.saveStudent(emp);
		 */
		 
        /*EmployeeBean i=dao.viewStudent(101);
        System.out.println(i);*/
        /*EmployeeBean Employeeone=dao.viewStudent(102);
        //Employeeone.setId(103);
        Employeeone.setName("pinky");
        Employeeone.setSalary(70000.00);
        dao.updateStudent(Employeeone);
        System.out.println("updated successfully");*/
		
		  dao.deleteStudent(101);
		  
		  System.out.println("deleted");
		 
		/*
		 * List<EmployeeBean>emp1= dao.StudentAll(); System.out.println(emp);
		 */
    }
}
