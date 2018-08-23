package com.mirko.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // 1. load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // 2. retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
