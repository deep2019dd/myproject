package com.bbit.misc;

public class SwitchTest {

	public void selectWhen10(){
		System.out.println("10 is selected in switch");
	}
	
	public void getSwitch(int option){
		
		switch(option){
			case 5: 
				System.out.println("selected 5");
				break;
			case 10:
				//System.out.println("selected 10");
				selectWhen10();
				break;
			case 20:
				System.out.println("selected 20");
				break;
			default:
				System.out.println("selected nothing");			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SwitchTest obj = new SwitchTest();
			obj.getSwitch(10);
		}catch(Exception ex){
			//System.out.println("error --"+ex.getMessage());
			ex.printStackTrace();
		}
	}

}
