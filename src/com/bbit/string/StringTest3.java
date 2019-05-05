package com.bbit.string;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "welcome";  //literal
		String a1 = "welcome";
		String b = new String("welcome");  //object
		String b1 = new String("welcome");
		/**
		if(a==a1){
			System.out.println("location same");
		}else{
			System.out.println("location different");
		}
		
		if(a.equals(a1)){
			System.out.println("value same");
		}else{
			System.out.println("value diferent");
		}
		**/
		if(a==b){
			System.out.println("location same");
		}else{
			System.out.println("location different");
		}
		
		if(a.equals(b)){
			System.out.println("value same");
		}else{
			System.out.println("value diferent");
		}
		
	}
	//String a = null;
}
