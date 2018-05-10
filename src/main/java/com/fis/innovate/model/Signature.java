package com.fis.innovate.model;

public class Signature {
	private String custID;
	private Boolean isValid;
	private String sign; 
	public Signature(){
		
	}
	public Signature(String custID,String sign,Boolean isValid) {
        this.custID=custID; 
        this.isValid=isValid;
		this.sign=sign;
	    }
		public String getCustID() {
	       return custID;
	    }
	    public void setCustID(String custID) {
	        this.custID = custID;
	    }
	    public Boolean getIsValid() {
	       return isValid;
	    }
	    public void setIsValid(Boolean isValid) {
	        this.isValid = isValid;
	    }	    
	    public String getSign() {
	    	//this.sign= new String("abc");
		    return this.sign;
	    }
	    public void setSign(String sign) {
	        this.sign = sign;
	    }    
	    private String validSign(){
	    	return new String("abc");
	    }
}
