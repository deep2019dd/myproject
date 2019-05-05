package com.bbit.oop;

import java.util.ArrayList;


public class EncapsulationTest {

	public static void main(String args[]){
		
		EncapStudent annesha = new EncapStudent();	
		annesha.setName("annesha");
		annesha.setCollege("BBIT");
		annesha.setRollNumber(100);
		annesha.setAddress("kolkata");
		
		EncapStudent anisha = new EncapStudent();	
		anisha.setName("anisha");
		anisha.setCollege("BBIT");
		anisha.setRollNumber(101);
		anisha.setAddress("Tripura");
		
		EncapStudent akash = new EncapStudent();	
		akash.setName("akash");
		akash.setCollege("BBIT");
		akash.setRollNumber(102);
		akash.setAddress("batanagar");
		
		EncapStudent sutapa = new EncapStudent();	
		sutapa.setName("sutapa");
		sutapa.setCollege("BBIT");
		sutapa.setRollNumber(105);
		sutapa.setAddress("batanagar");
		
		//System.out.println("name --"+akash.getAddress());
		
		
		//arrayList of custom object
		ArrayList<EncapStudent> studentList = new ArrayList<EncapStudent>();
		studentList.add(annesha);
		studentList.add(anisha);
		studentList.add(akash);
		studentList.add(sutapa);
		
		
		
	}
}
