package com.spring.sixth.AddressDIObjects;

public class StudentBean {
    private int studentId;
    private String studentName;
    private AddressBean addressBean;

    public StudentBean() {

    }

    public StudentBean(int studentId, String studentName, AddressBean addressBean) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.addressBean = addressBean;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddressBean(AddressBean addressBean) {
        this.addressBean = addressBean;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public AddressBean getAddressBean() {
        return addressBean;
    }

    public void print() {
        System.out.println("\nStudent Details: ");
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("\nAddress of the Student: ");
        System.out.println("House Number: " + addressBean.getHousenum());
        System.out.println("City: " + addressBean.getCity());
        System.out.println("State: " + addressBean.getState());
        System.out.println("Pincode: " + addressBean.getPincode());
    }
}
