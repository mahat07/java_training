package com.celcom.day3;

public class JavaBeanExp {
	int eid;
	String ename;
	int esal;
	public JavaBeanExp() {
		
	}
	public JavaBeanExp(int eid, String ename, int esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public static void main(String args[]) {
		JavaBeanExp abc =  new JavaBeanExp();
	}
	
	

}
