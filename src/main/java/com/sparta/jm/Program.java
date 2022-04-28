package com.sparta.jm;

import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        String greeting = greetingGenerator.getGreeting(LocalDateTime.now().getHour());

        System.out.println(greeting);
    }

}
