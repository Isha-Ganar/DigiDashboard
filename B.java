// Single Inheritance

package com.ishaganar.LearnInheritance;

class A
{
	void showA()
	{
		System.out.println("In A Class Method");
	}
}

public class B extends A
{
	void showB()
	{
		System.out.println("In B Class Method");
	}
	
	public static void main(String[] args) 
	{
		A obj1 = new A();
		obj1.showA();
		// obj1.showB();   // A doesn't having showB() method
		
		B obj2 = new B();
		obj2.showA();   // parent class method is inherited
		obj2.showB();

	}

}
