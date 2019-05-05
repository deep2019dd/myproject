package com.bbit.datatype;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 1000.0;
		long l = (long)d;
		int i = (int)d;
		
		String s = "1000";
		int i1 = Integer.parseInt(s);
		System.out.println("string to int ---"+i1);
		double d1 = Double.parseDouble(s);
		System.out.println("string to double ---"+d1);
		float f1 = Float.parseFloat(s);
		System.out.println("string to float ---"+f1);
		
		int i2 = 1000;
		String s2 = String.valueOf(i2);
		System.out.println("int to String ---"+s2);
		
		double d2 = 1000;
		String s3 = String.valueOf(d2);
		System.out.println("double to String ---"+s3);
		
	}

}
