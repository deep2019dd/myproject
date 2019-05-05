package com.bbit.revision;

public class AccessTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessTest objAccessTest = new AccessTest();
		System.out.println("value of public variable --"+objAccessTest.abcPublic);
		objAccessTest.getPublicData();
		
		//System.out.println("value of private variable --"+objAccessTest.abcPrivate);
		//objAccessTest.getPrivateData();
		
		System.out.println("value of protected variable --"+objAccessTest.abcProtected);
		objAccessTest.getProtectedData();
		
		System.out.println("value of default variable --"+objAccessTest.abcDefault);
		objAccessTest.getDefaultData();
	
	}

}
