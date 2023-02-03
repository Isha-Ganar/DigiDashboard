//Super Keyword To Invoke Constructor
package com.ishaganar.LearnPreDefinedKeywords;

class One
{
	One()
	{
		System.out.println("inside One Class Constructor");
	}	
}
public class LearnSuperKeywordToInvokeConstructor extends One
{

	LearnSuperKeywordToInvokeConstructor()
	{
		super(); // it is called by compiler automatically if its not written
		System.out.println("inside class LearnSuperKeywordToInvokeConstructor constructor");
	}
	
	
	public static void main(String[] args)
	{
		LearnSuperKeywordToInvokeConstructor LK = new LearnSuperKeywordToInvokeConstructor();
		System.out.println(LK.toString());
		
	}

}
