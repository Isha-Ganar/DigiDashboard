package com.ishaganar.LearnPreDefinedKeywords;

class Demo2
{
	static int a = 10;  // class level variables 
	
	void Display() 
	{
		// Static is not allowed with local variable. 
		//static int b = 19;
		System.out.println("");
	}
}
public class LearnStaticKeywordWithVariables 
{

	static int anb = 624; // class level variables 
	
	public static void main(String[] args)
	{
		System.out.println(anb);
		System.out.println(Demo2.a);

	}

}
