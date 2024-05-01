package com.spring.eleven.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean("id")
    public StudentBean getBean() {
        StudentBean bean = new StudentBean();
        bean.setId(1);
        bean.setName("prani");
        bean.setBatch(10);
        bean.setCourse("Java FULL STACK");
        return bean; 
    }
    @Bean("id2")
    public StudentBean getBean2() {
    	StudentBean bean = new StudentBean();
        bean.setId(10);
        bean.setName("rani");
        bean.setBatch(20);
        bean.setCourse("python FULL STACK");
        return bean;
    }
}
