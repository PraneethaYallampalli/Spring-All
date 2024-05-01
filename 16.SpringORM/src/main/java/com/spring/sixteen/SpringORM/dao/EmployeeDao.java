package com.spring.sixteen.SpringORM.dao;

import java.util.List;

import com.spring.sixteen.SpringORM.EmployeeBean;



public interface EmployeeDao {
public int saveStudent(EmployeeBean EmployeeBean) ;
	
    public EmployeeBean viewStudent(int id) ;
   
    public void updateStudent(EmployeeBean StudentBean);
    	
    
    public void deleteStudent(int id) ;
    	
    
    public List<EmployeeBean>StudentAll();
}
