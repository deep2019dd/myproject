package com.bbit.exception;

public class TestException1 {
	public void divide(int a, int b){
		try{
			int c = 0;
				c = a/b;
				System.out.println("output--"+c);

		}catch(ArithmeticException m){
			System.out.println("error message--->"+m.getMessage());
		}	
	}
	
	public void getLength(){
		try{
			System.out.println("enters");

			String s = null;
			int l = s.length();
			System.out.println("lenghth ---"+l);

			//String s="abc";  
			//int i= Integer.parseInt(s);
			
		}catch(Exception ex){
			System.out.println("error message--->"+ex.getMessage());
		}finally{
			System.out.println("finally block");
		}

	}
	
	public static void main(String args[]){
		
		TestException1 objTestException1 = new TestException1();
		//objTestException1.divide(6, 0);
		objTestException1.getLength();
	}

}
