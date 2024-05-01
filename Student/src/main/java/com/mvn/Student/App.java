package com.mvn.Student;

import com.mvn.Student.Interface.StudentImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
   /* {
        Student std1=new Student(22,"prani","Java","batch-11","22-09-2023","hyderabad");
     
   	 System.out.println("Student Rollno: " + std1.getRollno());
        System.out.println("Student Name: " + std1.getName());
   	 System.out.println("Student Course: " + std1.getCourse());
   	System.out.println("Student Batch: " + std1.getBatch());
   	System.out.println("Student Doj: " + std1.getDoj());
   	System.out.println("Student Location: " + std1.getLocation());
   	std1.setRollno(25);
   	std1.setName("rani");
	 std1.setCourse("python");
	 std1.setBatch("batch-11");
	 std1.setDoj("20-10-2023");
	 std1.setLocation("vizag");
	 System.out.println("\nUpdated Student Information:");
	 System.out.println("Student RollNo: " + std1.getRollno());

	 System.out.println("Student Name: " + std1.getName());
	 System.out.println("Student Course: " + std1.getCourse());
	 System.out.println("Student Batch: " + std1.getBatch());
	 System.out.println("Student Doj: " + std1.getDoj());
	 System.out.println("Student Location: " + std1.getLocation());


	
    }*/
    
    {
    	StudentImp std1=new StudentImp(25, "sweety", "Aws", "batch-19", "21-09-2024", "vijayawada");
		 

	   	 System.out.println("StudentImp Rollno: " + std1.getRollno());
	        System.out.println("StudentImp Name: " + std1.getName());
	   	 System.out.println("StudentImp Course: " + std1.getCourse());
	   	System.out.println("StudentImp Batch: " + std1.getBatch());
	   	System.out.println("StudentImp Doj: " + std1.getDoj());
	   	System.out.println("StudentImp Location: " + std1.getLocation());
   	std1.setRollno(29);
   	std1.setName("vyshu");
	 std1.setCourse("c#");
	 std1.setBatch("batch-16");
	 std1.setDoj("29-11-2023");
	 std1.setLocation("hyd");
   	 System.out.println("\nUpdated Student Information:");
	 System.out.println("StudentImp RollNo: " + std1.getRollno());

	 System.out.println("StudentImp Name: " + std1.getName());
	 System.out.println("StudentImp Course: " + std1.getCourse());
	 System.out.println("StudentImp Batch: " + std1.getBatch());
	 System.out.println("StudentImp Doj: " + std1.getDoj());
	 System.out.println("StudentImp Location: " + std1.getLocation());

    }
}
