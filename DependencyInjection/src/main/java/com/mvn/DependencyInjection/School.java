package com.mvn.DependencyInjection;

public class School {
	private String Name;
    private Student student;
    public School(String Name, Student student ) {
        this.Name=Name;
        this.student=student;
    }
    

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setStudent(Student student) {
        this.student=student;
    }

    public String getName() {
        return Name;
    }
    public Student getStudent() {
        return student; 
    }
    public void print() {
        System.out.println("School Name: " + Name);
        System.out.println("Student Details:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Class: " + student.getClass());
        System.out.println("Student Marks:");
        System.out.println("  Marks in Maths: " + student.getMarks().getMaths());
        System.out.println("  Marks in Physics: " + student.getMarks().getEnglish());
        System.out.println("  Marks in Chemistry: " + student.getMarks().getHindi());
    }

}
