package com.cybertek;

import com.github.javafaker.Faker;

public class Anything {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.book().title());
        System.out.println(faker.funnyName().name());
        System.out.println(faker.name().fullName());

    }
}
