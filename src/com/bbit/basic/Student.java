package com.bbit.basic;

public class Student {
	public String name="";
	public int age=0;
	public String address="";
	public int rollno = 0;
	public String branch= "";
	public int yearOfPassout=0;
	public int fifthSemResult=0;
	public int sixthSemResult=0;
	
	Student(String name,int age,String addr,int roll,String brn,int year,int fifth,int sixth){
		this.name=name;
		this.age=age;
		this.address=addr;
		this.rollno=roll;
		this.branch=brn;
		this.yearOfPassout=year;
		this.fifthSemResult=fifth;
		this.sixthSemResult=sixth;
	}
	
	public float calculatePercentage(){
		float value = 0;	
		value = (fifthSemResult+sixthSemResult)/2;	
		return value;
	}
}
