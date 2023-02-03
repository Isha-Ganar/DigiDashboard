// This Keyword To invoke Current Class Method in other method
package com.ishaganar.LearnPreDefinedKeywords;

public class LearnThisKeywordToInvokeMethod
{
	void Display() 
	{
		System.out.println("Inside Display Method");
	}
	void Add(int a,int b)
	{
		System.out.println(a+b);
		this.Display(); // Using This Keyword
		Display(); 		// Without Using This Keyword
		
	}

	public static void main(String[] args) 
	{
		LearnThisKeywordToInvokeMethod LM = new LearnThisKeywordToInvokeMethod();
		LM.Add(9, 10);
	}

}
