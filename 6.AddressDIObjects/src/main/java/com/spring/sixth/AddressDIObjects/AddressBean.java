package com.spring.sixth.AddressDIObjects;

public class AddressBean {
    private String housenum;
    private String city;
    private String state;
    private String pincode;
   public AddressBean() {
		
	}

    public AddressBean(String housenum, String city, String state, String pincode) {
        this.housenum = housenum;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public void setHousenum(String housenum) {
        this.housenum = housenum;
    }
    public void setCity(String city) {
    	this.city = city;
    	}
    public void setState(String state) {
    	this.state = state;
    	}
    public void setPincode(String pincode) {
    	this.pincode = pincode;
    	}

    public String getHousenum() {
        return housenum;
    }
   
    public String getCity() {
    	return city;
    	}
    	
    	public String getState() {
    	return state;
    	}
    	
    	public String getPincode() {
    	return pincode;
    	}
    	


}