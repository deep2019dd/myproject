package com.bbit.array;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = {11,100,1,2,45,3,4,58,66,6,9,111};
		int[] x = abc.clone();
		
		for(int element:x){
			System.out.println("element --"+element);
		}
	}

}
