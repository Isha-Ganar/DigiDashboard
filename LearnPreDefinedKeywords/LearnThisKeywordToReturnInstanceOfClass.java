//To Return the Instance of the Class

package com.ishaganar.LearnPreDefinedKeywords;

public class LearnThisKeywordToReturnInstanceOfClass 
{
	
	LearnThisKeywordToReturnInstanceOfClass Method()
	{
		return this;
	}
	
	public static void main(String[] args)
	{
		LearnThisKeywordToReturnInstanceOfClass LI = new LearnThisKeywordToReturnInstanceOfClass();
		System.out.println(LI.Method());

	}

}
