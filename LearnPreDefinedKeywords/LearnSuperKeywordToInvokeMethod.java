//Super Keyword to invoke immediate parent class method
package com.ishaganar.LearnPreDefinedKeywords;

class App
{
	void show()
	{
		System.out.println("In Class A");
	}
}
public class LearnSuperKeywordToInvokeMethod extends App
{

	void show() 
	{
		System.out.println("In Class LearnSuperKeywordToInvokeMethod");
	}
	void display() 
	{
		show(); 	   // it will invoke Current class method
		super.show(); // it will invoke Immediate parent class method
		this.show();  // it will invoke Current class method
	}
	public static void main(String[] args)
	{
		LearnSuperKeywordToInvokeMethod LK = new LearnSuperKeywordToInvokeMethod();
		LK.display();

	}

}
