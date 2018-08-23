package com.mirko.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // 1. load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. retrieve the bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // 3. call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // 3.1 call new methods
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // 4. close the context
        context.close();
    }
}
