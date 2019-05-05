package com.bbit.revision;

public class Student {

	String name ="";
	String address ="";
	int rollno = 0;
	String branch ="";
	int marks = 0;
	final String college = "BBIT";
	
	Student(){
		System.out.println("default constructor");
	}
	
	Student(String nm, String addr, int roll, String brn, int marks){
		System.out.println("initialize values within constructor");
		this.name = nm;
		this.address = addr;
		this.rollno = roll;
		this.branch = brn;		
		this.marks = marks;				
	}
	
	public String getCredit(){
		
		if(marks>75 && marks<90){
			return "good score";
		}
		else{
			return "moderate score";
		}
	}
	
	public void printDetails(){
		System.out.println("name--"+name+" address --"+address+" rollno--"+rollno+" branch--"+branch+" marks--"+marks+" college--"+college);
	}
	
}
