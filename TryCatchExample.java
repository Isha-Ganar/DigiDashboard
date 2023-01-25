package com.ishaganar;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args)
	{
		//try catch Finally
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter first number");
			int firstNum = sc.nextInt();
			System.out.println("Please enter Second number");
			int SecondNum = sc.nextInt();
			int result = firstNum/SecondNum;
			System.out.println("Answer is =" + result);
			sc.close();
			
		}catch(Exception e)
		{
			System.out.println("Divide by Zero not Allowed");
			// e.printStackTrace();
		}
		finally {
			System.out.println("This block is executed any how after try catch");
		}

	}

}
