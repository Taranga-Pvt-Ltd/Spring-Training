package com.tharanga.beforeadvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvicer implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] args, Object target)throws Throwable
	{
		System.out.println("additional concern brfore actual logic");
	}

}
