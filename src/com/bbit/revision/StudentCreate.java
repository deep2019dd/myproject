package com.bbit.revision;

public class StudentCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student akashDefault = new Student();
		Student akash = new Student("akash", "batanagar", 57, "ece",78);
		Student annesha = new Student("annesha", "new alipur", 51, "ece",74);
		
		System.out.println("college name ---"+akash.college);
		String akashResult = akash.getCredit();
		System.out.println("akashResult---"+akashResult);
		
		String anneshaResult = annesha.getCredit();
		System.out.println("anneshaResult---"+anneshaResult);
		
		akash.printDetails();
		annesha.printDetails();
			
	}

}
