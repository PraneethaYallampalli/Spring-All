package com.spring.twelve.EmployeeJavaBased;

public class Employee {
	private int id;
    private String name;
    private Address address;
    public Employee() {
		super();
		
	}
    public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
		
    }
    public void setId(int id) {
		this.id = id;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    public void setAddress(Address address) {
    	this.address=address;
    }
    public int getId() {
		return this.id;
	}
   

    public String getName() {
		return  this.name;
	}
    public Address getAddress() {
    	return this.address;
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address Details:");
        System.out.println("City: " + address.getCity());
        System.out.println("Colony: " + address.getColony());
        System.out.println("State: " + address.getState());
        System.out.println("Pincode: " + address.getPincode());
        }


	

}
