package com.spring.twelve.EmployeeJavaBased;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
	@Bean
	public Employee getBean() {
		Employee emp=new Employee();
		 emp.setId(101);
		 emp.setName("prani");
		 emp.setAddress(getBean1());
		 return emp;
	}
		
	@Bean
	public Address getBean1() {
		Address add =new Address();
		add.setCity("hyd");
	    add.setColony("sr nagar");
	    add.setState("Telangana");
	    add.setPincode(521401);
	    return add;
	}

	

}
