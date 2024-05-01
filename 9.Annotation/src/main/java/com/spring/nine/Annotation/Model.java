package com.spring.nine.Annotation;

public class Model {
	private int id;
	 private String name;
	 private String model;
	 public  Model() {
		 super();
	 }
	 public Model(int id,String name,String model) {
		 super();
		 this.id=id;
		 this.name=name;
		 this.model=model;
	 }
	 public void setId(int id) {
		 this.id=id;
	 }
	 public int getId() {
		 return this.id;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 return this.name;
	 }
	 public void setModel(String model) {
		 this.model=model;
	 }
	 public String getModel() {
		 return this.model;
	 }
	
	
	
		public void Start() {
			System.out.println("Car Started");
		}
}
