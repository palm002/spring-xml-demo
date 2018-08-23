package com.mirko.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // 1. load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // 2. retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same bean
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: "+ theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
