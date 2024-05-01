package com.mvn.Empolyee;

public class Emp {
private String name;
private int age;
private double salary;
public Emp() {
	// Initialize default values if needed
}
public Emp(String name,int age, double salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
}
public void setName(String name) {
	this.name=name;
}
public void setage(int age) {
	this.age=age;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public String getName() {
	return this.name;
}
public int getAge() {
	return this.age;
}
public double getSalary() {
	return this.salary;
}
}
