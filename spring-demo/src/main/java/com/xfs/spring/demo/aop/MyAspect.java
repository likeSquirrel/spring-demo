package com.xfs.spring.demo.aop;

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

    @Before("pointCutMethod()")
    public void advice() {
        System.out.println("小徐：");
    }
}
