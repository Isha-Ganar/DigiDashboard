package com.ishaganar.LearnPreDefinedKeywords;

public class LearnStaticKeywordWithStaticBlock 
{

	static int a; // static variable
	static 
	{
		// static block is used to initialize static variables 
		a = 98;
		
		System.out.println("Inside Static Block 3 :- " + a);
	}
	
	static 
	{
		System.out.println("Inside Static Block 1");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Inside Main Method");
	}
	
	static 
	{
		System.out.println("Inside Static Block 2");
	}
}
