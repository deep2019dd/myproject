package com.bbit.array;

public class Club {
	String clubName="";
	int players=0;
	String coachName="";
	double budget=0;
	
	Club(String c,int p,String co,double b){
		this.clubName=c;
		this.players=p;
		this.coachName=co;
		this.budget=b;
		System.out.println("details---"+clubName+","+players+","+coachName+","+budget);
		//System.out.println(clubName+playerNo);
		//System.out.println(clubName+playerNo+coachName+budget);
	}
}
