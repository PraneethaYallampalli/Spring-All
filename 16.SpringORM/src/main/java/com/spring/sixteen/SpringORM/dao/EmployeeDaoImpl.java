package com.spring.sixteen.SpringORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.sixteen.SpringORM.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDao {
	private HibernateTemplate hibernateTemplate;
	public EmployeeDaoImpl() {
        super();
    }

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
	public HibernateTemplate getHibernateTemplate() {
	    return this.hibernateTemplate;
	}


	@Override
	@Transactional
	
	public int saveStudent(EmployeeBean EmployeeBean) {
		int savedetails=(int) hibernateTemplate.save(EmployeeBean);
		return savedetails;
	}

	@Override
	@Transactional
	
	public EmployeeBean viewStudent(int id) {
		EmployeeBean emp=hibernateTemplate.get(EmployeeBean.class,id);
		
		return emp;
	}

	@Override
	@Transactional
	public void updateStudent(EmployeeBean StudentBean) {
		hibernateTemplate.update(StudentBean);
		
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		EmployeeBean emp=hibernateTemplate.get(EmployeeBean.class,id);
		hibernateTemplate.delete(emp);
		
	}

	@Override
	@Transactional
	public List<EmployeeBean> StudentAll(){
		List<EmployeeBean>emp=hibernateTemplate.loadAll(EmployeeBean.class);
		return emp;
		
	}
	

}
