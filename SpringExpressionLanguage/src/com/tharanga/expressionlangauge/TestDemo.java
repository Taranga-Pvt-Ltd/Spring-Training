package com.tharanga.expressionlangauge;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestDemo {
	
	public static void main(String args[])
	{
		ExpressionParser parser = new SpelExpressionParser();
	//	Expression exp = parser.parseExpression("'Hello Expression Language'");
		
		Expression exp = parser.parseExpression("'Hello Expression Language'.concat('!!!!').concat('???')");
		
		String msg = (String) exp.getValue(exp);
		
		System.out.println(msg);
	}

}
