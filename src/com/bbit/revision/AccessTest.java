package com.bbit.revision;

public class AccessTest {
	

	//public method & variable
	public String abcPublic = "wonderful:public";
	public void getPublicData(){
		System.out.println("public data called");
	}
	
	//private method & variable
	private String abcPrivate = "wonderful:private";
	private void getPrivateData(){
		System.out.println("private data called");
	}
	
	//protected method & variable
	protected String abcProtected = "wonderful:protected";
	protected void getProtectedData(){
		System.out.println("protected data called");
	}
	
	//default method & variable
	String abcDefault = "wonderful:default";
	void getDefaultData(){
		System.out.println("default data called");
	}
	
	static String valueStatic = "wonderful:static";
	final String valueFinal = "wonderful:final";
	
}
