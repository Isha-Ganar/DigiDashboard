package com.ishaganar.LearnPolymorphism;

class test
{
	void show(int a,String b) 
	{
		System.out.println("1");
	}
}

public class LearnMethodOverriding extends test
{

	@Override
	void show(int a,String b) 
	{
		System.out.println("2");
	} 
	
	public static void main(String[] args) 
	{
		test t = new test();
		t.show(8,"urvi");
		
		test Lmo = new LearnMethodOverriding();
		Lmo.show(9,"purvi");
		
		LearnMethodOverriding Lmo2 = new LearnMethodOverriding();
		Lmo2.show(9,"purvi");

	}

}
