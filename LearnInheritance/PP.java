//Hierarchical Inheritance

package com.ishaganar.LearnInheritance;

class RR
{
	void showR() 
	{
		System.out.println("In RR Class methods");
	}
	
}

class QQ extends RR
{
	void showQ()
	{
		System.out.println("In QQ Class methods");
	}
	
}

public class PP extends RR
{

	void showP()
	{
		System.out.println("In PP Class methods");
	}
	
	public static void main(String[] args) 
	{
		RR obj1 = new RR();
		QQ obj2 = new QQ();
		PP obj3 = new PP();
		
		 //R Class Methods for obj1
		obj1.showR();;    
		System.out.println();
		
		//R & Q Class methods for obj2
		obj2.showR();;     
		obj2.showQ();
		System.out.println();
		
		//P & R Class methods for obj3
		obj3.showR();
		obj3.showP();
		
		

	}

}
