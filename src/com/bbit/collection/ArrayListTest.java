package com.bbit.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("Sutapa");
		arList.add("anisha");
		arList.add("annesha");
		arList.add("akash");
		
		for(String element:arList){
			System.out.println("element--"+element);
		}
		
	}

}
