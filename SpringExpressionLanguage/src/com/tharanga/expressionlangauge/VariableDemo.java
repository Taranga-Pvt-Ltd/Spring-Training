package com.tharanga.expressionlangauge;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class VariableDemo {
	
	
	public static void main(String args[])
	{
	
	Calculation cal = new Calculation();
	StandardEvaluationContext context = new StandardEvaluationContext(cal);
	
	ExpressionParser parser = new SpelExpressionParser();
	parser.parseExpression("number").setValue(context,"15"); 
	
	System.out.println(cal.cube());
	
	}
}
