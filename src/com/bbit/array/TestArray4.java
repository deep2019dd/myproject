package com.bbit.array;

public class TestArray4 {

	static void reverseFunction(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            //System.out.print(b[k]+","); 
            System.out.println(b[k]); 
        } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inutArray = {10, 45, 70, 20, 30, 40, 90, 50}; 
		reverseFunction(inutArray,inutArray.length);
	}

}
