package com.sparta.jm;

public class GreetingGenerator {

    public static final String GOOD_MORNING = "Good morning!";
    public static final String GOOD_AFTERNOON = "Good afternoon!";
    public static final String GOOD_EVENING = "Good evening!";
    public static final String INVALID = "timeOfDay contained a value less than 0 or greater than 23";

    public String getGreeting(int timeOfDay) {
        if (!isValid(timeOfDay)) {
            return INVALID;
        }

        if (timeOfDay >= 5 && timeOfDay <= 12) {
            return GOOD_MORNING;
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            return GOOD_AFTERNOON;
        } else {
            return GOOD_EVENING;
        }
    }

    private boolean isValid(int timeOfDay) {
        // Test for 0-23 inclusive
        return (timeOfDay >= 0 && timeOfDay <= 23);
    }
}
