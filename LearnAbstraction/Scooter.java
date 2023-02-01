package com.ishaganar.LearnAbstraction;

abstract class Vehicle 
{
	int age;
	abstract void start();
}

class car extends Scooter
{

	@Override
	void start() 
	{
		System.out.println("car start with key");
		
	}
	
	
}
class Scooter extends Vehicle
{

	@Override
	void start() 
	{
		System.out.println("scooter start with kick");
		
	}
	
	public static void main(String[] args) 
	{
		//Vehicle v = new Vehicle();
		
		car c = new car();
		c.start();
		
		Scooter sc = new Scooter();
		sc.start();
		
	}
	
	
}
