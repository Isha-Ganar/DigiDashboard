package com.ishaganar;

//Custom User Defined Exception
class AgeNotAllowedException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	AgeNotAllowedException()
	{
		super();
	}
	AgeNotAllowedException(String m)
	{
		super(m);
	}
	
}
public class ThrowExample {

	public static void main(String[] args)
	{
		int age = 2;
		try 
		{
			if(age < 18) 
			{
				
				throw new AgeNotAllowedException();
			}else {
				System.out.println("Do Vote");
			}
		}catch(Exception e)
		{
			System.out.println("Not Allowed :- Dont Vote");
			//e.printStackTrace();
		}	

	}

}
