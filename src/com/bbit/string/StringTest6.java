package com.bbit.string;

public class StringTest6 {

	public static void main(String[] args){
		
		String a = "hello";
		String b = " world";				
		String c = a.concat(b);
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello");
		//System.out.println("output1 --"+sb.toString());
		sb.append(" world");
		
		sb.append(" Java");
		sb.append(" StringBuffer");
		System.out.println("output2 --"+sb.toString());
		
		int capacity = sb.capacity();
		//System.out.println("capacity ---"+capacity);
		
		int len = sb.length();
		//System.out.println("len ---"+len);
		System.out.println("reversed --"+sb.reverse());
		
		char ch = sb.charAt(0);
		System.out.println("char at position 0 --"+ch);
	}
}
