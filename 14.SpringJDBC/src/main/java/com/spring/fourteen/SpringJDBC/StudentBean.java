package com.spring.fourteen.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentBean {
        private JdbcTemplate jdbcTemplate;
        public StudentBean() {
        	super();
        }
        public  StudentBean (JdbcTemplate jdbcTemplate){
        	super();
        	this.jdbcTemplate = jdbcTemplate;
        }
        public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public JdbcTemplate getJdbcTemplate() {
            return jdbcTemplate;
        }
        public void create() {
            jdbcTemplate.execute("create table Student(id int, name varchar(20), course varchar(20))");
            System.out.println("Table created");
        }

}

