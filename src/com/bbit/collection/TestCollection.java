package com.bbit.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>(); //generics
		
		arr.add("annesha");
		arr.add("sutapa");
		arr.add("anisha");
		arr.add("akash");
		arr.add("abc");
		arr.add("xyz");
		
		System.out.println("string version --"+arr.toString());
		//using iterator
		Iterator itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println("iterator element --"+itr.next());
		}
		
		/**
		//System.out.println("elements --"+arr.toString());
		System.out.println("arraylist : before");
		for(String element : arr){
			System.out.println("element of arrayList --"+element);
		}
		
		//System.out.println("element at 2nd position --"+arr.get(1));
		arr.remove(5);
		
		System.out.println("arraylist : after");
		for(String element : arr){
			System.out.println("elemnt of arrayList --"+element);
		}
		*/
		arr.remove("akash");
		System.out.println("arraylist : after removal");
		for(String element : arr){
			System.out.println("elemnt of arrayList --"+element);
		}
		
		
		
	}

}
