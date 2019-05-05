package com.bbit.revision;

public class Annesha implements IStudentBBIT{
	public void getStudent(){
		System.out.println("i am annesha");
	}
	public void getAddress(){
		System.out.println("i stay at new alipur");
	}
	public static void main(String args[]){
		//Annesha obj = new Annesha();
		IStudentBBIT obj = new Annesha(); //good practice
		
		obj.getStudent();
		obj.getAddress();
		System.out.println("i study in "+obj.college);
	}
}

