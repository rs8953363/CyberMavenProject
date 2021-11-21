package com.cybertek;

import com.github.javafaker.Faker;

public class MavenTest {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.address().city());
        System.out.println(faker.name().name());
        System.out.println(faker.phoneNumber().cellPhone());
    }
}
