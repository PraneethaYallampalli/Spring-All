package com.spring.eight.MapInterface;

import java.util.Map;

public class AmeerpetTechnologies {
    private Map<String, String> studentCourses;

    
    public AmeerpetTechnologies() {
        
    }

   
    public AmeerpetTechnologies(Map<String, String> studentCourses) {
        this.studentCourses = studentCourses;
    }

    
    public void setStudentCourses(Map<String, String> studentCourses) {
        this.studentCourses = studentCourses;
    }

    
    public Map<String, String> getStudentCourses() {
        return studentCourses;
    }
    
    public void print() {
        System.out.println("\n List of Student Courses: ");
        for (Map.Entry<String, String> entry : studentCourses.entrySet()) {
        	System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

   
}
