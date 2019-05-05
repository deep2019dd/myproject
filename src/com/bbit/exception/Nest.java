package com.bbit.exception;

public class Nest {
	
	public static void main(String args[]){
		 //Parent try block
	     try{
	    	//Child try block1
	         try{
	            System.out.println("Inside block1");
	            int b =45/0;
	            System.out.println("VALUE OF B--"+b);
	         }
	         catch(ArithmeticException e1){
	            System.out.println("Exception: e1--"+e1.getMessage());
	         }
	         //Child try block2
	         try{
	            System.out.println("Inside block2");
	            String s = null;
	            System.out.println(s.length());
	         }catch(NullPointerException e2){
	            System.out.println("Exception: e2---"+e2.getMessage());
	         }
	        System.out.println("Just other statement");
	    }
	    catch(ArithmeticException e3){
	    	 System.out.println("Arithmetic Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.println("ArrayIndexOutOfBoundsException");
	        System.out.println("Inside parent try catch block");
	    }
	    catch(Exception e5){
	    	System.out.println("Exception--"+e5.getMessage());
	        System.out.println("Inside parent try catch block");
	    }
	    System.out.println("Next statement..");
	  }

}