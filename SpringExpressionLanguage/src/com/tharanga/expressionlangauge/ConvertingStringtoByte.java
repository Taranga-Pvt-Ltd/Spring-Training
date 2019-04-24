package com.tharanga.expressionlangauge;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ConvertingStringtoByte {
	public static void main(String args[])
	{
		ExpressionParser parser = new SpelExpressionParser();
		
		//Converting string into byte
		Expression exp2 = parser.parseExpression("'Hello World'.bytes");
		byte[] b1 = (byte[]) exp2.getValue();
		for(int i=0;i<b1.length;i++)
		{
			System.out.println(b1[i]+" ");
		}   
		
		
		//length of the string
		Expression exp = parser.parseExpression("'Hello World'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);
		
		
		//String Content into Uppercase
		
		Expression exp1 = parser.parseExpression("'Hello World'.toUpperCase()");
		String s1 = (String) exp1.getValue();
		System.out.println(s1);
		
		//String Content into Lowercase
		Expression exp3 = parser.parseExpression("'Hello World'.toLowerCase()");
		String s2 = (String) exp3.getValue();
		System.out.println(s2);
		
	}

}
