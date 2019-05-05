package com.bbit.array;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value = {10,2,103,7,999,25,4,50,77,4,99,1};
		//for(int sutapa : value){
			//System.out.println("value--"+sutapa);
		//}
		
		int maxValue = value[0];
		for(int i =0; i<value.length;i++){
			
			if(value[i]>maxValue){
				maxValue = value[i];
			}
			
		}
		int minValue = value[0];
		
		for(int i =0; i<value.length;i++){
			
			if(value[i]<minValue){
				minValue = value[i];
			}
			
		}
		System.out.println("min value --"+minValue);

	}

}
