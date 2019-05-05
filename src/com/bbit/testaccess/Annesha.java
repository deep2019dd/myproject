package com.bbit.testaccess;

public class Annesha extends Akash  {
	public void getsum(){
		System.out.println("test");
		
	}
	public static void main(String[] args){
		Akash obj=new Annesha();
		obj.printdefaultName();
		obj.printProtectedName();
		obj.printPublicName();
		//obj.printPrivateName();
	}

}
 