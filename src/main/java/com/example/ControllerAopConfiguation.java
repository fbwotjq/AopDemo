package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAopConfiguation {

	 Logger logger = LoggerFactory.getLogger(getClass());

	@Before("execution(* com..*Controller.*(..))")
	public void loggingAdvice(JoinPoint joinPoint) {
		logger.info("method path : " + joinPoint.getSignature());
	}
	
	@AfterReturning("execution(* com..*Controller.*(..))")
	public void logServiceAccess(JoinPoint joinPoint) {
		logger.info("method path : " + joinPoint.getSignature());
	}
	
}
