package com.bbit.string;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";  //string literal in java
		//System.out.println("value of a --"+a);
		String b = " world";
		System.out.println(a.concat(b));
		String c = a+b;
		System.out.println("value of c --"+c);
		
		String d = "SUTAPA";
		System.out.println(d.toLowerCase());
		System.out.println(c.toUpperCase());
		
		System.out.println("lenght of d --"+d.length());
		
		if(d.equalsIgnoreCase("SUTAPA")){
			System.out.println("valid");
		}else{
			System.out.println("invalid");
		}
		
		
	}

}
