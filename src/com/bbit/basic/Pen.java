package com.bbit.basic;

public class Pen {
	
	String penBrand ="";
	String bodyType="";
	int price=0;
	String refill="";
	
	Pen(String brand,String body, int price, String refillType){
		this.penBrand = brand;
		this.bodyType = body;
		this.price = price;
		this.refill = refillType;
		
		System.out.println(brand+"-"+body+"-"+price+"-"+refillType);
	}
	
	public int getPenPrice(int penPrice){
		int count = 0;
		if(penPrice>10){
			count = 10;
		}else{
			count = 20;
		}
		int finalPrice = penPrice*count;
		return finalPrice;
	}
	
	

}
