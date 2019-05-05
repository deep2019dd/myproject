package com.bbit.oop;

public class TestOverrride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ObjBank = new Bank();
		//ObjBank.getInterest();
		
		//Bank ObjBank = new Bank();
		
		Bank objSBIBank = new SBIBank();
		objSBIBank.getInterest();
		
		Bank objICICIBank = new ICICIBank();
		objICICIBank.getInterest();
	}

}
