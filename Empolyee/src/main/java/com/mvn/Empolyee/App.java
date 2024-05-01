package com.mvn.Empolyee;

import com.mvn.Empolyee.Interface.EmpImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    
    /*{
    	 Emp emp1=new Emp("john",30,5000.0);
    	 System.out.println("Emp Name: " + emp1.getName());
    	 System.out.println("Emp Age: " + emp1.getAge());
    	 System.out.println("Emp Salary: " + emp1.getSalary());
    	 emp1.setName("prani");
    	 emp1.setage(40);
    	 emp1.setSalary(6000.0);
    	 System.out.println("\nUpdated Emp Information:");
    	 System.out.println("Emp Name: " + emp1.getName());
    	 System.out.println("Emp Age: " + emp1.getAge());
    	 System.out.println("Emp Salary: " + emp1.getSalary());
    	
    }*/
    	{
    		EmpImp emp1=new EmpImp("mahi",20,9000.0);
    		 System.out.println("EmpImp Name: " + emp1.getName());
        	 System.out.println("EmpImp Age: " + emp1.getAge());
        	 System.out.println("EmpImp Salary: " + emp1.getSalary());
        	 emp1.setName("rani");
        	 emp1.setAge(29);
        	 emp1.setSalary(10000.0);
        	 System.out.println("\nUpdated Emp Information:");
        	 System.out.println("EmpImp Name: " + emp1.getName());
        	 System.out.println("EmpImp Age: " + emp1.getAge());
        	 System.out.println("EmpImp Salary: " + emp1.getSalary());
        	
    		
    	}
}
