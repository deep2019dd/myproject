package com.bbit.array;

public class TestArray7 {

	public int[] getArray(int a[], int n){
		
		int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
		return b;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inutArray = {99, 10, 45, 70, 20, 30, 40, 90, 50}; 
		TestArray7 obj = new TestArray7();
		int x[] = obj.getArray(inutArray,inutArray.length);
		
		for(int i =0;i<x.length;i++){
			System.out.println("element ---"+x[i]);
		}
		
	}

}
