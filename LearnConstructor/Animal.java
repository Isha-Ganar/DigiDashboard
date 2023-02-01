package com.ishaganar.LearnConstructor;

//Constructor Practice 


public class Animal 
{
	String Name;
	int Age;
	
	//Default Constructor is created by Compiler
	
	//non Parameterized 
	//User Defined Non argument Constructor 
	Animal()
	{
		
	}
	
	// Parameterized Constructor
	Animal(String N, int A)
	{
		this.Name = N;
		this.Age = A;
	}
	
	public static void main(String[] args) 
	{
		Animal an = new Animal("tommy" , 2); // initialize object by using Constructor
		System.out.println(an.Name);
		System.out.println(an.Age);
	}

}
