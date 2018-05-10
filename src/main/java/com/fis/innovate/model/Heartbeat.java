package com.fis.innovate.model;

public class Heartbeat {

	public Heartbeat() {
        
    }
    public Heartbeat(String id) {
        super();
        this.id = id;
    }
    
    private String id = "";
    private String hbCode = "";
    private static boolean status = false;
    
    public static String hbCodeStatic = "dgfGVCGgvgcvgvKVJJHXbghtqfreKOIUUOUutyyut";
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getHbCode() {
        return hbCode;
    }
    public void setHbCode(String hbCode) {
        this.hbCode = hbCode;
    }
    
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        Heartbeat.status = status;
    }
}
