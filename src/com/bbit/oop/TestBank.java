package com.bbit.oop;

public class TestBank {
	
	public static void main(String args[]){
		AbstractBank objSBI = new Sbi();
		AbstractBank objUBI = new UBI();
		
		int sbiROI = objSBI.getRateOfInterest();
		int ubiROI = objUBI.getRateOfInterest();
		System.out.println("sbiROI--"+sbiROI);
	}
}
