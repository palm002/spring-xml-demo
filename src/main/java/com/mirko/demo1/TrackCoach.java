package com.mirko.demo1;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run 5km";
    }

    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // add init method
    public void init() {
        System.out.println("TrackCoach: init");

    }

    // add destroy method
    public void destroy() {
        System.out.println("TrackCoach: destroy");
    }
}
