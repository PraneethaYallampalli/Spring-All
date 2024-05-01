package com.spring.eight.SetInterface;

import java.util.Set;

public class AmeerpetTechnologies {
    private Set<Integer> studentRollNumbers;

    
    public AmeerpetTechnologies() {
        
    }

    
    public AmeerpetTechnologies(Set<Integer> studentRollNumbers) {
        this.studentRollNumbers = studentRollNumbers;
    }

    
    public void setStudentRollNumbers(Set<Integer> studentRollNumbers) {
        this.studentRollNumbers = studentRollNumbers;
    }

    
    public Set<Integer> getStudentRollNumbers() {
        return this.studentRollNumbers;
    }

   
    public void print() {
        System.out.println("\n List of Student RollNumbers: ");
        for (int rollNo : studentRollNumbers) {
            System.out.println(rollNo);
        }
    }
}

