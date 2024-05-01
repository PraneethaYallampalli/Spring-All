package com.spring.twelve.ProductJavaBaesd;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public ProductBean getBean() {
		 Scanner scan = new Scanner(System.in);
    	 System.out.println("enter your id");
    	 int id=scan.nextInt();
    	 System.out.println("enter your name");
    	 String name=scan.next();
    	 System.out.println("enter your quantity");
    	 int quantity=scan.nextInt();
    	 System.out.println("enter your price");
    	 double price=scan.nextDouble();
    	 ProductBean pb=new ProductBean(id,name,quantity,price);
    	 return pb;
     }
	}


