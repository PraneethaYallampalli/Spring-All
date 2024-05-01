package com.spring.eleven.JavaBasedConfiguration;

public class StudentBean {
     private int id;
     private String name;
     private int batch;
     private String  course;
     public StudentBean() {
   	  
     }
     public StudentBean(int id, String name, int batch,String course) {
    	 this.id=id;
   	  this.name=name;
   	  this.course=course;
   	  this.batch=batch;
     }
     public void setId(int id) {
   	  this.id=id;
   	  
     }
     public void setName(String name) {
   		this.name=name;
   	}
     public void setBatch(int batch) {
  		this.batch=batch;
  		
  	}
     public void setCourse(String course) {
 		this.course=course;
 	}
   
     public int getId() {
   	  return this.id;
     }
     public String getName() {
   		return this.name;
   	}
     public int getBatch() {
    		return this.batch;
    	}
     public String getCourse() {
   		return this.course;
   	}
     public void display() {
         System.out.println("Student ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Batch: " + batch);
         System.out.println("Course: " + course);
     }
    
}
