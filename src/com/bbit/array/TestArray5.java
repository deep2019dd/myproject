package com.bbit.array;

public class TestArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = {{1, 2, 3, 4},{5, 6, 7},{9,10,11}};
		for(int i =0;i<myNumbers.length;i++){
			//System.out.println("element--"+myNumbers[i]);
			for(int j=0;j<myNumbers[i].length;j++){
				System.out.println("elements --"+myNumbers[i][j]);
			}
		}
		
	}

}
