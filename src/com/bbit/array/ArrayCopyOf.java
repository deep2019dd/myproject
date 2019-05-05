package com.bbit.array;

import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = {"one","two","three","four","five","six"};
		
		String[] y = Arrays.copyOf(x, x.length);
		
		String[] z = Arrays.copyOf(x, 3); //will copy the 3 first elements of array x
		
		System.out.println("Array x: " + Arrays.toString(x));
		System.out.println("Array y: " + Arrays.toString(y));
		System.out.println("Array z: " + Arrays.toString(z));
	}

}
