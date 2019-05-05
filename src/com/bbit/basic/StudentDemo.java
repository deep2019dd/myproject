package com.bbit.basic;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sutapa = new Student("sutapa", 21, "kolkata", 05, "ECE", 2020, 90, 85);
		float percentage_sutapa=sutapa.calculatePercentage();
		System.out.println("percentage_sutapa---"+percentage_sutapa);
		
		Student Anisha= new Student("Anisha", 22, "Kolkata", 54, "ECE", 2020, 85, 80);
		float percentage_Anisha=Anisha.calculatePercentage();
		System.out.println("percentage_anisha---"+percentage_Anisha);
		
	}

}
