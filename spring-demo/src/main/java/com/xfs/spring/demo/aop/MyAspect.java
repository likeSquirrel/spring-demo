package com.xfs.spring.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut(value = "execution(* com.xfs.spring.demo.bean.TestDemo.*(..))")
	private void pointCutMethod() {

	}

	@Pointcut("@target(com.xfs.spring.demo.annotation.MyAnnotation)")
	private void pointCutsWithAnnotation() {
	}

	@Before("pointCutMethod() && pointCutsWithAnnotation()")
	public void advice() {
		System.out.println("小徐：");
	}

	@After(value = "execution(* com.xfs.spring.demo.bean.TestDemo.*(..))")
	private void afterMethod() {
		System.out.println("  此致 \n敬礼！");
	}
}
