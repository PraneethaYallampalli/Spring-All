package com.spring.seven.FormOfCollections;

import java.util.List;

public class AmeerpetTechnologiesBean {
	
		private List <String> studentnames;
		public AmeerpetTechnologiesBean() {
			
		}
		public AmeerpetTechnologiesBean(List studentnames) {
			this.studentnames=studentnames;
		}
		public void setStudentnames(List studentnames) {
			this.studentnames=studentnames;
		}
		public List getStudentnames() {
			return this.studentnames;
		}
		public void print() {
			System.out.println("\n List of StudentNames: ");
			for(String stdname:studentnames) {
				System.out.println(stdname);
			}
		}
		
}