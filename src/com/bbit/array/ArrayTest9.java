package com.bbit.array;

public class ArrayTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = new int[10];
		int[] xyz = {11,100,1,2,45,3,4,58,66,6,9,111};
		try{
			for(int i=0;i<xyz.length;i++){
				abc[i]=xyz[i];
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
			System.out.println("1. error is --"+ex.getMessage());
		}catch(Exception e){
			System.out.println("2. error is --"+e.getMessage());
		}finally{
			System.out.println("code ends .........");
		}
		
	}

}
