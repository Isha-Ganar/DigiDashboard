package com.ishaganar.LearnPreDefinedKeywords;

class Xyz
{
	int i = 65;
	
	static int j = 667;
	
	static void show() 
	{
		System.out.println("show method from Xyz class");
		
		// 1) this will show error if instance variables accessed are non static
		// System.out.println(i); 
		
		
		// static methods can access only static data.
		System.out.println(j);	
		
		
		//2) Only static methods can be called directly in static method
		test();	
		
	}
	
	
	static void test() 
	{
		System.out.println("Welcome");
	}
	
}
public class LearnStaticKeywordWithMethod extends Xyz
{

	int a = 56;
	
	static void disp() 
	{
		System.out.println("disp method from LearnStaticKeywordWithMethod class");
	}
	
	public static void main(String[] args)
	{
		disp();  // static method from the same class.
		LearnStaticKeywordWithMethod.disp(); // static method from the same class.
		
		
		Xyz.show(); //static method from the Different class.
		
		
   //3) In static method we can not refer to 'this' or 'super' keywords anyways
		//System.out.println(this.a);
		//System.out.println(super.i);

	}

}
