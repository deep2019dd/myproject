package com.bbit.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<String>();
		
		arr.add("annesha");
		arr.add("sutapa");
		arr.add("anisha");
		arr.add("akash");
		arr.add("akash");
		arr.add("abc");
		arr.add("xyz");
		arr.add("anisha");
		
		//replace element
		arr.set(5, "efgh");
		
		//position of element
		System.out.println("position of anisha --"+arr.indexOf("anisha"));
		
		//check for element
		if(arr.contains("abc")){
			System.out.println("abc found");
		}else{
			System.out.println("abc not found");
		}
		
		arr.add(2,"mnop");
		
		//size of arraylist
		System.out.println("size of arr --"+arr.size());
		//using iterator
		Iterator itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println("iterator element --"+itr.next());
		}
		
		/**
		//System.out.println("elements --"+arr.toString());
		System.out.println("arraylist : before");
		for(String element : arr){
			System.out.println("elemnt of arrayList --"+element);
		}
		
		//System.out.println("element at 2nd position --"+arr.get(1));
		arr.remove(5);
		
		System.out.println("arraylist : after");
		for(String element : arr){
			System.out.println("elemnt of arrayList --"+element);
		}
		
		//removal of element
		arr.remove("akash");
		System.out.println("arraylist : after removal");
		for(String element : arr){
			System.out.println("elemnt of arrayList --"+element);
		}
		*/
	}
}

