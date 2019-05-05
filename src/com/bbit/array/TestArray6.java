package com.bbit.array;

public class TestArray6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club[] array = new Club[100];
		
		//Club objclub = new Club("EastBengal",10,"Akash",100);
		for (int i = 0; i < 100; i++) {
			Club obj1 = new Club("East Bengal",10,"Akash",100);
			Club obj2 = new Club("Mohan Bagan",12,"Anisha",120);
			Club obj3 = new Club("Chennai FC",10,"Sutapa",150);
		    // set properties
		    array[i] = obj1;
		}
		
	}

}
