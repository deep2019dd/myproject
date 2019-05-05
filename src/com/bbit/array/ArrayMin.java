package com.bbit.array;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = {11,100,1,2,45,3,4,58,66,6,9,111};
		int value = abc[0];
		for(int k=0;k<abc.length;k++){
			if(abc[k]<value){
				value=abc[k];
			}
		}
		System.out.println("min value--"+value);
	}

}
