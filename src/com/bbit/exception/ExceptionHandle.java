package com.bbit.exception;

public class ExceptionHandle {
	
	public void getValue(int a, int b) throws ArithmeticException, NullPointerException{
		double c = a/b;
		System.out.println("value ---"+c);
	}
	
	public static void main(String args[]){
		

		try{
			System.out.println("entering try");
			ExceptionHandle obj = new ExceptionHandle();		
			obj.getValue(12,0);
			System.out.println("just after try");
		}catch(ArithmeticException ae){
			System.out.println("entering catch");
			System.out.println("exception type--   "+ae.getMessage());
			System.out.println("just after catch");
		}catch(NullPointerException ne){
			System.out.println("exception type--   "+ne.getMessage());
		}catch(Exception e){
			System.out.println("exception type--   "+e.getMessage());
		}
		finally{
			System.out.println("finally block");
		}

		
	}

}
