package com.bbit.basic;

public class PenPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen celloPen=new Pen("cello","plastic",8,"ink");
		Pen linkPen=new Pen("link","plastic",9,"ink");
		int linkprice=linkPen.getPenPrice(9);
		int celloprice=celloPen.getPenPrice(8);
		System.out.println(linkprice);
		System.out.println(celloprice);
	}

}
