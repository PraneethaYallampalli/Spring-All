package com.spring.fifteen.SpringORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.fifteen.SpringORM.StudentBean;
public class StudentDaoImpl implements StudentDao {
	private HibernateTemplate hibernateTemplate;
	public StudentDaoImpl() {
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
	public int saveStudent(StudentBean StudentBean) {
		int savedetails=(int) hibernateTemplate.save(StudentBean);
		return savedetails;
		
	}

	@Override
	@Transactional
	public StudentBean viewStudent(int id) {
		StudentBean std=hibernateTemplate.get(StudentBean.class,id);
		return std;
	}

	@Override
	@Transactional
	public void updateStudent(StudentBean StudentBean) {
		hibernateTemplate.update(StudentBean);
		
	}

	@Override
	@Transactional
	public  void deleteStudent(int id) {
		StudentBean std=hibernateTemplate.get(StudentBean.class,id);
		if(std!=null)
		hibernateTemplate.delete(std);
		
	}

	@Override
	
	public List<StudentBean> StudentAll() {
		List<StudentBean>std=hibernateTemplate.loadAll(StudentBean.class);
		return std;
	}

}
