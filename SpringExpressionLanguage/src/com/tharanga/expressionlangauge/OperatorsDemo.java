package com.tharanga.expressionlangauge;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class OperatorsDemo {
	public static void main(String args[])
	{
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'I am a Java Developer'+'!'");
		
		String s1 = (String) exp.getValue();
		System.out.println(s1);
		
		//Arithmetic Expression
		System.out.println(parser.parseExpression("10*10/2").getValue());
		
		System.out.println(parser.parseExpression("'Today is: '+new java.util.Date()").getValue());
		
		//Logical operator
		System.out.println(parser.parseExpression("false and false").getValue());
		
		//relational operator
		System.out.println(parser.parseExpression("'ramya'.length()==5").getValue());
	}

}
