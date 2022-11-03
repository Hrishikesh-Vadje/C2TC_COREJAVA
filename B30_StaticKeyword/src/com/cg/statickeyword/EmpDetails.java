package com.cg.statickeyword;

public class EmpDetails {
private int eId;
private String name;
private String joiningDate;
private long contact;
private int ctc;


public EmpDetails(int eId, String name, String joiningDate, long contact, int ctc) {
	super();
	this.eId = eId;
	this.name = name;
	this.joiningDate = joiningDate;
	this.contact = contact;
	this.ctc = ctc;
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(String joiningDate) {
	this.joiningDate = joiningDate;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public int getCtc() {
	return ctc;
}
public void setCtc(int ctc) {
	this.ctc = ctc;
}



}
