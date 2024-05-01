package com.spring.fifteen.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.fifteen.SpringORM.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
       StudentDao dao=(StudentDao) context.getBean("stDao");
       StudentBean std =new StudentBean();
		/*
		 * std.setId(101); std.setName("prani"); std.setCourse("java full stack");
		 * std.setId(102); std.setName("lucky"); std.setCourse("python full stack");
		 */
		 /*dao.saveStudent(std); */
      /* StudentBean i=dao.viewStudent(101);
       System.out.println(i);*/
		/*
		 * dao.deleteStudent(101);
		 * 
		 * System.out.println("deleted");
		 */
		/*
		 * List<StudentBean>st=dao.StudentAll(); System.out.println(st);
		 */
       StudentBean studentone=dao.viewStudent(102);
          //studentone.setId(103);
          studentone.setName("mom");
          studentone.setCourse(".net");
          dao.updateStudent(studentone);
          System.out.println("updated successfully");
    }
    
}
