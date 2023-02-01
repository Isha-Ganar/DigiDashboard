package com.ishaganar.LearnObjectsClassesMethods;


//Class
//if Access modifier is not specified before class then "Default" is applied.
public class Animal
{
	//Attributes //variables 
	String colour;
	int age;
	
	
	
	public Animal(String colour, int age) {
		super();
		this.colour = colour;
		this.age = age;
	}

	public Animal() {
	
	}

	//Method
	public void eat()
	{
		System.out.println("I Am eating");
	}
	
	//Method to initialize object 
	void InitObj(String c, int a)
	{
		colour = c ;
		age = a ;
	}
	
	void Display() 
	{
		System.out.println(colour +" "+ age );
	}
	
	//Main Method
	public static void main(String[] args)
	{
		//Statements will run in Top Down Sequence.
		Animal Buzo = new Animal();  // Object Creation
		Buzo.eat(); // Calling the method
		Buzo.run();
		
		
		///--Initializing the Object--///
		
		//1) ---By Using Reference Variable---//
			Buzo.age = 10 ;
			Buzo.colour = "Brown" ;
			System.out.println("Age " + Buzo.age + " ===> colour " + Buzo.colour);
		
		//2) ---By using Method---//
		    Buzo.InitObj("Pink", 7);
		    Buzo.Display();
		    
		//3) ---By using Constructor---//
		    Animal Buzo2 = new Animal("Tommy",6);
		    System.out.println();
		    Buzo2.Display();
		    
	}

	//method
	public void run()
	{
		System.out.println("I am running");
	}
	
	
	
	
	
}
