// This Keyword To pass as a Argument in Method call And Constructor call

package com.ishaganar.LearnPreDefinedKeywords;

class Testing
{
	//
	Testing(LearnThisKeywordAs_a_Argument L)
	{
		System.out.println("In the Constructor of Test Class");
		System.out.println(L);
	}
		
}
public class LearnThisKeywordAs_a_Argument
{

	// method 
	void Method1(LearnThisKeywordAs_a_Argument LA)
	{
		System.out.println(LA.toString());
		System.out.println(LA.hashCode());
	}
	//inside method call
	void Method2()
	{
		System.out.println(this);
		Method1(this);
	}
	
	void Method3() 
	{
		Testing t = new Testing(this);
		t.toString();
	}
	
	public static void main(String[] args) 
	{
		LearnThisKeywordAs_a_Argument LA = new LearnThisKeywordAs_a_Argument();
		LA.Method2();

		LA.Method3();
		
	}

}
