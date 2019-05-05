package com.bbit.oop;

public class Polymorph1 {
	
	public int a = 0;
	public String b = "";
	
	public void getSum(int i, int j, int k){
		int  l = i+j+k;
		System.out.println("value of sum --"+l);
	}	
	public void getSum(int i, int j){
		int  l = i+j;
		System.out.println("value of sum --"+l);
	}
	public void getSum(int i, int j, double m){
		int  l = i+j;
		if(m<l){
			System.out.println("value of sum --"+l);
		}
		else{
			System.out.println("greater");
		}
	}
	public void getSum(int i){
		int  l = i+10;
		System.out.println("value of sum --"+l);
	}	
	public void getSum(String i, String j){
		String c = i+j;
		System.out.println("value of sum --"+c);
	}	
	public void getSum(String i, String j, String k){
		String c = i+j+k;
		System.out.println("value of sum --"+c);
	}
	public int doSum(int i, int j, int k){
		int  l = i+j+k;
		return l;
	}
	
	public static void main(String args[]){
		Polymorph1 obj = new Polymorph1();
		obj.getSum("akash","mukherjee");
		obj.getSum(2,3,6);
	}

}
