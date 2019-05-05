package com.bbit.string;

public class StringTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("aniaashaSiaaaanha");
		String x= sb.toString();
		System.out.println("x:"+x);
		char[] y= x.toCharArray();
		int count=0;
		char value ='a';
		for(int i=0;i<y.length;i++){
			//System.out.println("value--"+y[i]);
			if(y[i]==value){
				count++;				
			}
		}
		System.out.println("number of occurnce of a --"+count);
	}
}
