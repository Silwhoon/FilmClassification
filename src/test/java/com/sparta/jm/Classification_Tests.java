package com.sparta.jm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {

    @ParameterizedTest
    @ValueSource(ints = {7, 8, 11})
    public void underTwelve(int age) {
        String actualResult = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals("U & PG films are available.", actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    public void underFifteen(int age) {
        String actualResult = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals("U, PG & 12 films are available.", actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 17})
    public void underEighteen(int age) {
        String actualResult = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 21})
    public void otherAges(int age) {
        String actualResult = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals("All films are available.", actualResult);
    }
}
