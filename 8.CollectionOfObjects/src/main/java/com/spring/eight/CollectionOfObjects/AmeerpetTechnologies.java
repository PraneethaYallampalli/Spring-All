package com.spring.eight.CollectionOfObjects;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AmeerpetTechnologies {
	private List<String>empName;
	private Set<Integer>empNum;
	private Map<String,Integer>empDeptNo;
	private Properties empSalary;
	public AmeerpetTechnologies() {
        
    }
	 public AmeerpetTechnologies(List<String> empName,Set<Integer> empNum, Map<String,Integer> empDeptNo,Properties empSalary) {
	        this.empName = empName;
	        this.empNum=empNum;
	        this.empDeptNo=empDeptNo;
	        this.empSalary=empSalary;
	        
	    }
	

	    public void setEmpName(List<String> empName) {
	        this.empName = empName;
	    }
	    public void setEmpNum(Set<Integer> empNum) {
	        this.empNum = empNum;
	    }
	    public void setEmpDeptNo(Map<String, Integer> empDeptNo) {
	        this.empDeptNo = empDeptNo;
	    }
	    public void setEmpSalary(Properties empSalary) {
	        this.empSalary = empSalary;
	    }

	    public List<String> getEmpName() {
	        return empName;
	    }
	   
	    public Set<Integer> getEmpNum() {
	        return empNum;
	    }

	     public Map<String, Integer> getEmpDeptNo() {
	        return empDeptNo;
	    }

	    public Properties getEmpSalary() {
	        return empSalary;
	    }
	    
	    public void print() {
	        System.out.println("Employee Names:");
	        for (String name : empName) {
	            System.out.println(name);
	        }

	        System.out.println("Employee Numbers:");
	        for (int num : empNum) {
	            System.out.println(num);
	        }
	        System.out.println("Employee Department Numbers:");
	        for (Map.Entry<String, Integer> entry : empDeptNo.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Department Number: " + entry.getValue());
	        }

	        
	        Set<String>keys=empSalary.stringPropertyNames();{
				for(String key: keys) {
					System.out.println(key+" : "+empSalary.getProperty(key));
				}
        }
	    }
}


