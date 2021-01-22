package com.xfs.spring.demo.bean;

import org.springframework.stereotype.Component;

import com.xfs.spring.demo.annotation.MyAnnotation;

@Component
@MyAnnotation(1)
public class TestDemo {


	public void hello() {
		System.out.println("hello,world!");
	}
}
