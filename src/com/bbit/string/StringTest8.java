package com.bbit.string;

public class StringTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("akash");
		
		//sb.insert(7,"sen");
		//System.out.println("sb --"+sb.toString());
		
		//sb.delete(7, sb.length());
		//System.out.println("sb (after deletion)--"+sb.toString());
		sb.delete(0,3);
		System.out.println("sb (after deletion)--"+sb.toString());
		
	}

}
