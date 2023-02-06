package com.ishaganar.LearnPreDefinedKeywords;

public class LearnFinalKeywordWithVariables
{

	public static void main(String[] args) 
	{
		
		final int i = 67;
		//i = i + 56;   //This line will show error cuz i is Declared as final and we cannot change it.
		System.out.println(i);
		
		
		int j = 6;
		j = j + 7; 		// This line will not show any error cuz j variable is not declared as final.
		System.out.println(j);
		
		
	}

}
