package net.javaguides.employeemanagement.model;

import java.io.Serializable;


public class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String id;
    private String Name;
    private String nic;
    private String department;
    private String designation;
    private String joinedDate;
    public String getid; {
        return id;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setLastName(String Name) {
        this.Name = Name;
    }
    public String getnic() {
        return nic;
    }
    public void setUsername(String nic) {
        this.nic = nic;
    }
    public String getdepartment() {
        return department;
    }
    public void setPassword(String department) {
        this.department = department;
    }
    public String designation() {
        return designation;
    }
    public void setAddress(String designation) {
        this.designation = designation;
    }
    public String getjoinedDate() {
        return joinedDate;
    }
    public void setContact(String joinedDate) {
        this.joinedDate = joinedDate;
    }
	public void setFirstName(String id2) {
		// TODO Auto-generated method stub
		
	}
}
