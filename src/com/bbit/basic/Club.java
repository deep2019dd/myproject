package com.bbit.basic;

public class Club {
	String clubName="";
	int playerNo=0;
	String coachName="";
	double budget=0;
	
	Club(String c,int p,String co,double b){
		this.clubName=c;
		this.playerNo=p;
		this.coachName=co;
		this.budget=b;
		System.out.println("details---"+clubName+","+playerNo+","+coachName+","+budget);
		//System.out.println(clubName+playerNo);
		//System.out.println(clubName+playerNo+coachName+budget);
	}
}	
