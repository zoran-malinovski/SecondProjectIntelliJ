package com.company;

public class FirstClass {

    public static void main(String[] args) {

        System.out.println("Best Regards for" + ":");
        firstPerson("Zoran " + "Malinovski");
        secondPerson("Zlatko " + "Kalinski");

    }


    public static void firstPerson(String name){
        System.out.println("Mr. " +name);
    }

    public static void secondPerson(String name){
        System.out.println("Mr. " +name);
    }


}
