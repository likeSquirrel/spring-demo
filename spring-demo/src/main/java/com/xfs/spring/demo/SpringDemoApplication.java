package com.xfs.spring.demo;

import com.xfs.spring.demo.bean.TestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringDemoApplication.class, args);
        TestDemo bean = run.getBean(TestDemo.class);
        bean.hello();
    }

}
