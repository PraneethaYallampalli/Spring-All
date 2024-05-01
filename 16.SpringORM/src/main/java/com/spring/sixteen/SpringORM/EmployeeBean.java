package com.spring.sixteen.SpringORM;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeBean {
	@Id
    private int id;
    private String name;
    private double salary;

    public EmployeeBean() {
        
    }

    public EmployeeBean(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    
}
