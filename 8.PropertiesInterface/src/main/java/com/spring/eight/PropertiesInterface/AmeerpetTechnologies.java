package com.spring.eight.PropertiesInterface;


import java.util.Properties;
import java.util.Set;

public class AmeerpetTechnologies {
	private Properties studentBatches;
	   public AmeerpetTechnologies() {
	        
	    }
	   public AmeerpetTechnologies(Properties studentBatches) {
	        this.studentBatches = studentBatches;
	    }
	   public void setStudentBatches(Properties studentBatches) {
	        this.studentBatches = studentBatches;
	    }

	   
	    public Properties getStudentBatches() {
	        return studentBatches;
	    }
	    public void print() {
	        Set<String> keys = studentBatches.stringPropertyNames();
	        for (String key : keys) {
	            System.out.println(key + ": " + studentBatches.getProperty(key));
	        }
	    }



}
