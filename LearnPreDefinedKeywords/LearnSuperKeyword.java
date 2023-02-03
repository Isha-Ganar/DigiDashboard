package com.ishaganar.LearnPreDefinedKeywords;

class A
{
	
	int i = 10;
	
	
}
public class LearnSuperKeyword extends A  //it needs inheritance concept
{
	int i = 2;

	void show(int i)
	{
		System.out.println(i);   // it will return local variables value
		System.out.println(this.i); // it will return current class instance variables
		System.out.println(super.i); // it will return parent class instance variables
		
	}
	public static void main(String[] args)
	{
		LearnSuperKeyword LK = new LearnSuperKeyword();
		LK.show(56);

	}

}
