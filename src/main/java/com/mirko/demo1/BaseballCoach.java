package com.mirko.demo1;

public class BaseballCoach implements Coach {

    // 1. define a private field for the dependency
    private FortuneService fortuneService;

    // 2. define a constructor
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {

        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        //  use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
