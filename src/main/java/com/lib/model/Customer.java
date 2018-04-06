package com.lib.model;

public class Customer {
	
	private int custNo;
    private String custName;
    private String country;
    
    
    public Customer(int custNo, String custName,String country) {
    	this.custNo = custNo;
    	this.custName = custName;
    	this.country = country;
		
	}
    
    
    
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+custName+", No :"+custNo+", Country :"+country;
	}

}
