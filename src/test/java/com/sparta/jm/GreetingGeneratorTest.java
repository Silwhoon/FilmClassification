package com.sparta.jm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.sparta.jm.GreetingGenerator.*;

class GreetingGeneratorTest {

    private final GreetingGenerator greetingGenerator = new GreetingGenerator();

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    // Note: 12 should be considered as Morning, this was specifically requested by product manager
    public void goodMorning(int time) {
        String actualResult = greetingGenerator.getGreeting(time);
        Assertions.assertEquals(GOOD_MORNING, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 16, 18})
    public void goodAfternoon(int time) {
        String actualResult = greetingGenerator.getGreeting(time);
        Assertions.assertEquals(GOOD_AFTERNOON, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 1, 4})
    public void goodEvening() {
        String actualResult = greetingGenerator.getGreeting(19);
        Assertions.assertEquals(GOOD_EVENING, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 50, 24})
    public void outOfBounds() {
        String actualResult = greetingGenerator.getGreeting(24);
        Assertions.assertEquals(INVALID, actualResult);
    }
}