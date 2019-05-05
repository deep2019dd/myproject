package com.bbit.string;

public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "akash";
		String s2 = "akash";
		
		//System.out.println(s1.compareTo(s2));
		if(s1.compareTo(s2)!=-1){
			System.out.println("values are same");
		}
		else{
			System.out.println("values are different");
		}
		
		String s3 = "akash mukherjee";
		int len = s3.length();
		System.out.println("lenght of s3 ---"+len);
		
		char s4 = s3.charAt(3);
		System.out.println("position 3 --"+s4);
		
		//substring()
		
		String s5 = s3.substring(0,6);
		System.out.println("after substring operation -->"+s5+"<--");
		
		String data = "welcome to kolkata in very hot summer";
		String[] dataSplit = data.split(" ");
		
		/*
		for(String element: dataSplit){
			System.out.println("element --"+element);
		}
		*/
		String abc = "Alpha, Beta, Delta, Gamma, Sigma";
		String[] abcSplit = abc.split(",");
		
		for(int i=0;i<abcSplit.length;i++){
			System.out.println("new element --"+abcSplit[i]);
		}
		
	}

}
