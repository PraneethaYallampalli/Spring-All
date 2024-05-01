package com.spring.fifteen.SpringORM.dao;

import java.util.List;

import com.spring.fifteen.SpringORM.StudentBean;

public interface StudentDao {
	public int saveStudent(StudentBean StudentBean) ;
	
    public StudentBean viewStudent(int id) ;
   
    public void updateStudent(StudentBean StudentBean);
    	
    
    public void deleteStudent(int id) ;
    	
    
    public List<StudentBean>StudentAll();

	
}
