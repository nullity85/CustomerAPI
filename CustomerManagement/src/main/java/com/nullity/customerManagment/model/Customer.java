package com.nullity.customerManagment.model;

public class Customer 
{
	private String id;
	private String idType;
    private String customerName;
    private String customerNationality;
    private int customerAge;
    private String customerDOB;
    private String customerSegment;
    private String customerAccountNo;

    public Customer(String _id, String _idType, String _customerName, String _customerNationality,
    		int _CustomerAge, String _customerDOB , String _customerSegment,  
    		String _customerAccountNo) {
        this.id = _id;
        this.idType = _idType;
        this.customerName = _customerName;
        this.customerNationality = _customerNationality;
        this.customerAge = _CustomerAge;
        this.customerDOB = _customerDOB;
        this.customerSegment = _customerSegment;
        this.customerAccountNo = _customerAccountNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String _id) {
        this.id = _id;
    }
    
    public String getIdType() {
        return idType;
    }

    public void setIdType(String _idType) {
        this.idType = _idType;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }
    
    public String getCustomerNationality() {
        return customerNationality;
    }

    public void setcCstomerNationality(String _customerNationality) {
        this.customerNationality = _customerNationality;
    }
    
    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int _customerAge) {
        this.customerAge = _customerAge;
    }
    
    public String getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(String _customerDOB) {
        this.customerDOB = _customerDOB;
    }
    
    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String _customerSegment) {
        this.customerSegment = _customerSegment;
    }
    
    public String getCustomerAccountNo() {
        return customerAccountNo;
    }

    public void setCustomerAccountNo(String _customerAccountNo) {
        this.customerAccountNo = _customerAccountNo;
    }
}
