package com.ishaganar.LearnPreDefinedKeywords;

class Demo
{
	final void M1() 
	{
		System.out.println("I am in Class Demo");
	}
	
}
public class LearnFinalKeywordWithMethods extends Demo
{
	
	//This block will show error Because M1 method Cannot be override As its declared as final
    
	/*
	void M1() 
	{
		System.out.println("I am in Class LearnFinalKeywordWithMethods");
	}
    */
	
	
	public static void main(String[] args) 
	{
		LearnFinalKeywordWithMethods fk = new LearnFinalKeywordWithMethods();
		fk.M1();

	}

}
