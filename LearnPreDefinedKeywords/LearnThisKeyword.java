package com.ishaganar.LearnPreDefinedKeywords;

class test
{
	int i; // instance variables
	int j;
	
	
	void setValue(int i , int c /* Local Variables */) 
	{
		// if Instance variable and local variable has same Name this keyword is used
		this.i = i; // this keyword will refer to the instance variable of the class.
		j = c; // no need to use this keyword Because both variables have different name.
	}

	void display()
	{
		System.out.println(i);
		System.out.println(j);
	}

}

public class LearnThisKeyword 
{

	public static void main(String[] args) 
	{
		test t1 = new test();

		t1.setValue(10,6);
		t1.display();

	}

}
