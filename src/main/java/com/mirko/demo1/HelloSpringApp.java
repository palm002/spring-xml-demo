package com.mirko.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // 1. load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // 3. call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        // 3.1 call new method fortunes
        System.out.println(theCoach.getDailyFortune());

        // 4. close the context
        context.close();
    }
}
