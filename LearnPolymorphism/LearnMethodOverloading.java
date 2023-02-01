//Method overloading
package com.ishaganar.LearnPolymorphism;

public class LearnMethodOverloading 
{

	//No. of args
	void test() 
	{
		System.out.println("Method Overloading");
	}
	void test(int a) 
	{
		System.out.println("1");
	}
	void test(String s) 
	{
		System.out.println("ish");
	}
	
	//types
	void test(int a,int b) 
	{
		System.out.println(a+b);
	}
	void test(String a, String b) 
	{
		System.out.println(a + b);
	}
	
	
	//Sequence 
	void test(int a,String b) 
	{
		System.out.println(a+b);
	}
	void test(String a,int b) 
	{
		System.out.println(a+b);
	}
	
	
	
	
	public static void main(String[] args)
	{
		LearnMethodOverloading lmo = new LearnMethodOverloading();
		lmo.test();
		lmo.test(4);
		lmo.test("Isha");
		lmo.test(23, 2);
		lmo.test("Heloo ", "World");
		lmo.test(1, "Jammy");
		lmo.test("Watson",2);
		
	}

}
