package com.bbit.revision;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valueStatic = AccessTest.valueStatic;
		System.out.println("valueStatic --"+valueStatic);
		
		AccessTest objAccessTest = new AccessTest();
		System.out.println("valueFinal --"+objAccessTest.valueFinal);
		
		//String finalVal = objAccessTest.valueFinal;
		//finalVal = "change";
		//System.out.println("finalVal --"+finalVal);
	}

}
