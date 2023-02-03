// This Keyword To invoke Current Class Constructor in other Constructor
package com.ishaganar.LearnPreDefinedKeywords;

public class LearnThisKeywordToInvokeConstructor 
{

	LearnThisKeywordToInvokeConstructor()
	{
		this(10);
		System.out.println("In Default Constructor");
	}
	
	LearnThisKeywordToInvokeConstructor(int a)
	{
		//this(); Recursive invocation will show error
		System.out.println("In Parameterised Constructor");
	}
	
	public static void main(String[] args) 
	{
		LearnThisKeywordToInvokeConstructor LC1 = new LearnThisKeywordToInvokeConstructor();
		
		
	    LearnThisKeywordToInvokeConstructor LC2 = new LearnThisKeywordToInvokeConstructor(10);
	    
	    System.out.println(LC1.toString()); 
	    System.out.println(LC2.toString());
		
	}

}
