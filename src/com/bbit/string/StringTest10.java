package com.bbit.string;

public class StringTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("hello akash");
		System.out.println("initial output --->"+sb.toString());
		sb.replace(6,sb.length(),"Sutapa");
		System.out.println("final output --->"+sb.toString());
	}

}
