package com.bbit.oop;

import java.util.ArrayList;

public class EncapTest {
	
	public ArrayList getDetailsList(){
		
		ArrayList<EncapStudent> studentList = new ArrayList<EncapStudent>();
		
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
		sutapa.setAddress("Tripura");
		
		studentList.add(annesha);
		studentList.add(anisha);
		studentList.add(akash);
		studentList.add(sutapa);
		
		return studentList;
	}
}
