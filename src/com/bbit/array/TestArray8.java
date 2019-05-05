package com.bbit.array;

public class TestArray8 {

	public static void main(String[] args) {

		int[] abc = {1,2,3,4,5,6,9};
		int[] x = new int[abc.length];
		//System.out.println("length(before)--"+x.length);
		
		for(int i=0;i<abc.length;i++){
			x[i]=abc[i];
		}
		for(int k:x){
			System.out.println("element--"+k);
		}
		System.out.println("length(after)--"+x.length);
	}

}
