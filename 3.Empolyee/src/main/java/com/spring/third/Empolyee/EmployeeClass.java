package com.spring.third.Empolyee;

public class EmployeeClass {
    
    private int id;
    private String name;
    private double salary;
    private int deptno;
    private String doj;

   
    public EmployeeClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeClass(int id, String name, double salary, int deptno, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
		this.doj = doj;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public void print() {
    	System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department Number: " +deptno);
        System.out.println("Employee Date of Joining: " + doj);
    }
}
