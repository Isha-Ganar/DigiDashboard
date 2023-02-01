//Multilevel Inheritance

package com.ishaganar.LearnInheritance;

class AA
{
	void showA() 
	{
		System.out.println("In AA Class methods");
	}
	
}

class BB extends AA
{
	void showB()
	{
		System.out.println("In BB Class methods");
	}
	
}

public class CC extends BB
{

	void showC()
	{
		System.out.println("In CC Class methods");
	}
	
	public static void main(String[] args) 
	{
		AA obj1 = new AA();
		BB obj2 = new BB();
		CC obj3 = new CC();
		
		 //A Class Methods for obj1
		obj1.showA();    
		System.out.println();
		
		//A & B Class methods for obj2
		obj2.showA();     
		obj2.showB();
		System.out.println();
		
		//A, B & C Class methods for obj3
		obj3.showA();
		obj3.showB();
		obj3.showC();
		
		

	}

}
