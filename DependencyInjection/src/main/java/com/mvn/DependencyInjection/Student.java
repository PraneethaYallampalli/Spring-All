package com.mvn.DependencyInjection;

public class Student {
	private String Name;
    private int class1;
    private Marks Marks;
    public Student() {
    	
    }
    public Student(String Name, int Class, Marks Marks) {
        this.Name=Name;
        this.class1=Class;
        this.Marks=Marks;
    }
    
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getClass1() {
		return class1;
	}
	public void setClass(int class11) {
		class1 = class11;
	}
	public Marks getMarks() {
		return Marks;
	}
	public void setMarks(Marks marks) {
		Marks = marks;
	}

    
  
}
