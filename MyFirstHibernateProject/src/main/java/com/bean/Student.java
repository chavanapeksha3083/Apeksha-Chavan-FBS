package com.bean;

public class Student 

{
	private int rollNo;
	private String sName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String sName)
	{
	
		this.rollNo = rollNo;
		this.sName = sName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + "]";
	}
	
	
	

}
