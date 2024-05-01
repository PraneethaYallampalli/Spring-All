package com.spring.nine.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
      private Model model;
      public Car() {
    	  super();
      }
      public Car(Model model) {
    	  super();
    	  this.model=model;
      }
      
      public void setModel(Model model) {
    	  this.model=model;
    	  System.out.println("this is setter method..");
      }
      @Autowired
      public Model getModel() {
    	  return this.model;
      }
      public void CarStarted() {
    	  if(model!= null) {
    		  model.Start();
    	  }
    	  else
    	  {
    		  System.out.println("Car not Started");
    	  }
      }
}
