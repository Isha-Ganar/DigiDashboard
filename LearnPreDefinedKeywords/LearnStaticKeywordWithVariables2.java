package com.ishaganar.LearnPreDefinedKeywords;


public class LearnStaticKeywordWithVariables2 
{

	int EmpId;
	String EmpName;
	
	// Common field for all objects thats why it is declared as static
	static String Company = "Capgemini"; 
	
	static int count;
	
	public LearnStaticKeywordWithVariables2(int empId, String empName) 
	{
		super();
		EmpId = empId;
		EmpName = empName;
		count++; 
		System.out.println("Counter for static Varible :- "+count);
	}

	void Display() 
	{
		System.out.println(EmpId + " " + EmpName + " " +  Company);
	}
	


	public static void main(String[] args)
	{
		LearnStaticKeywordWithVariables2 Emp1 = new LearnStaticKeywordWithVariables2(101, "Isha");
		
		Emp1.Display();

		
		LearnStaticKeywordWithVariables2 Emp2 = new LearnStaticKeywordWithVariables2(102, "Nikita");
		
		Emp2.Display();
		
		
		LearnStaticKeywordWithVariables2 Emp3 = new LearnStaticKeywordWithVariables2(103, "Namrata");
	
		Emp3.Display();
	}

}
