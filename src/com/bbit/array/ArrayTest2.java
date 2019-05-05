package com.bbit.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] abc = {"a","b","c","d","10"};
		int length = abc.length;
		System.out.println("length of array ---"+length);
		for(int i=0;i<(abc.length);i++){
			System.out.println("element--"+abc[i]);
		}		
		for(String x:abc){
			System.out.println("new element--"+x);
		}

	}

}
