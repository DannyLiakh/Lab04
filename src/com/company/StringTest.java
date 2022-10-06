package com.company;

public class StringTest {

    public static void stringMethod() {
        String hello = "Hi";
        String world = "Hello World";

        System.out.println("Length of hi is " + hello.length());
        System.out.println("Length of Hello World " + world.length());
        for (int i = 0; i < world.length(); i++) {
            if (world.charAt(i) == 'o') {
                System.out.println("o has index of " + i);
            }
        }
        String newworld = "";
        for (int i = 0; i < world.length(); i++) {
            newworld = newworld + " ";
            newworld = newworld + world.charAt(i);
        }
        System.out.println(newworld);
        String newhi = hello + newworld;
        System.out.println(newhi);
        System.out.println(newhi.toLowerCase());
        System.out.println(newhi.toUpperCase());
    }
}
