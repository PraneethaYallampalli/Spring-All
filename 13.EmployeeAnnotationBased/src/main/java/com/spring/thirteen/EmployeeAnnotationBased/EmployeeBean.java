package com.spring.thirteen.EmployeeAnnotationBased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {


    @Value("101")
    private int id;
    @Value("prani")
    private String name;
    @Value("java developer")
    private String job;
    @Value("25000")
    private double salary;
    

   
    public EmployeeBean() {
		super();
		
	}


	public EmployeeBean(int id, String name, String job, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.job=job;
		this.salary = salary;
		
	}


	public void setId(int id) {
		this.id = id;
	}
  public void setName(String name) {
		this.name = name;
	}
  public void SetJob(String job) {
	  this.job=job;
  }
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
  
	public String getName() {
		return name;
	}
	 public String getJob() {
		   return job;
	   }

	public double getSalary() {
		return salary;
	}


	


	

	public void display() {
    	
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Job:" +job);
        System.out.println("Employee Salary: " + salary);
        
    }
}
