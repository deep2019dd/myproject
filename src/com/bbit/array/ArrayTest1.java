package com.bbit.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] student = {"akash","anisha","sutapa","annwesha","aritro","arijit"};
		String[] student = {"akash","anisha","sutapa","annwesha","aritro","arijit"};
		//String student[] = {"akash","anisha","sutapa","annwesha","aritro","arijit"};		
		double[] value = {10000,2000000,3400000,1,2,10,90000,20000};
		
		for(double v: value){
			System.out.println("double values ---"+v);
		}
		
		int[] intvalue = {1,2,3,4,5};
		
		//System.out.println("second element --"+student[1]);
		//int length = student.length;
		
		//System.out.println("length---"+length);
		
		/*
		for(int i=0;i<student.length;i++){
			System.out.println("student--"+student[i]);
		}
		
		
		for(int i=0;i<value.length;i++){
			System.out.println("student--"+value[i]);
		}

		
		for(int i=0;i<5;i++){
			System.out.println("intvalue--"+intvalue[i]);
		}
		*
		*/
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String carName : cars) {
		  System.out.println(carName);
		}
		
		
		
		

	}

}
