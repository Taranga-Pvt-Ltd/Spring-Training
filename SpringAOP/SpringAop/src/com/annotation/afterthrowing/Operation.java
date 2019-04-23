package com.annotation.afterthrowing;

public class Operation {
	
	public void validate(int age) throws Exception
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid for vote");
		}
		else
		{
			System.out.println("Thanks for vote");
		}
			
	}

}
