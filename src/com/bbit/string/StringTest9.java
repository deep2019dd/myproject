package com.bbit.string;

public class StringTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Anisha sinhA");
		
		System.out.println("index of h--"+sb.indexOf("h"));
		//System.out.println("last index of a--"+sb.lastIndexOf("a"));
		//System.out.println("5th position of a --"+sb.charAt(5));
		
		System.out.println("5th position of a -->"+sb.indexOf("a", 5));
		
		
		

	}

}
