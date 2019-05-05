package com.bbit.string;

public class StringSearch {
	public static void main(String[] args) {
		String str = "today, the weather is very hot";
		char[] strArr = str.toCharArray();	
		int vowelCount = 0;
		int others = 0;
		for(int i=0;i<strArr.length;i++){
			//System.out.println("-->"+strArr[i]+"<--");
			if(strArr[i]=='a'|| strArr[i]=='e'|| strArr[i]=='i'|| strArr[i]=='o' || strArr[i]=='u'){
				vowelCount++;
			}
			else{
				others++;
			}
		}
		System.out.println("vowel count--"+vowelCount);
		System.out.println("others count--"+others);
	}
}
