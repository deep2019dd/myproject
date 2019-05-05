package com.bbit.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckEncapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapTest obj = new EncapTest();
		ArrayList<EncapStudent> studentList = obj.getDetailsList();
		
		for(EncapStudent element: studentList){			
			System.out.println("student name from each element--"+element.getName());			
		}
		
		Iterator<EncapStudent> itr = studentList.iterator();
		while(itr.hasNext()){
			System.out.println("each address --"+itr.next().getAddress());
		}
	
	}

}
