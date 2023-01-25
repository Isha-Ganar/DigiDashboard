package com.ishaganar;

//Throws keyword
class Calculate
{
	
	void Divide() throws ArithmeticException
	{
		int result = 60/5;
		
		System.out.println(result);
	}
	
}

public class ThrowsExample {

	public static void main(String[] args) 
	{
		Calculate c = new Calculate();
		try 
		{
		 c.Divide();
		}catch(ArithmeticException e)
		{
			System.out.println("Cant Divide by Zero");
		}
		System.out.println("End of Code!");
	}

}
