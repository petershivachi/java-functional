package com.shivachi.streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Dan", Gender.MALE),
                new Person("Jane", Gender.FEMALE),
                new Person("Doe", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Jack", Gender.MALE),
                new Person("Steve", Gender.MALE),
                new Person("Smith", Gender.MALE),
                new Person("Jill", Gender.FEMALE),
                new Person("Sarah", Gender.FEMALE),
                new Person("Mary", Gender.FEMALE),
                new Person("Rob", Gender.PREFER_NOT_TO_SAY)
        );

        System.out.println("*******************************************************************************");
        System.out.println("Print Genders");
        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("*******************************************************************************");
        System.out.println("\n");

        System.out.println("*******************************************************************************");
        System.out.println("Names in the array");
        people.stream().map(person -> person.name).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("*******************************************************************************");
        System.out.println("\n");

        System.out.println("*******************************************************************************");
        System.out.println("Length of names in the array");
        people.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);
        System.out.println("*******************************************************************************");

        System.out.println("*******************************************************************************");
        System.out.println("Verify of array only contains females");
        boolean arrayContainsOnlyFemales = people.stream().allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(arrayContainsOnlyFemales);
        System.out.println("*******************************************************************************");

        System.out.println("*******************************************************************************");
        System.out.println("Verify of array contains females");
        boolean arrayContainsFemales = people.stream().anyMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(arrayContainsFemales);
        System.out.println("*******************************************************************************");

        System.out.println("*******************************************************************************");
        System.out.println("Verify array contains only males and females");
        boolean arrayContainsOnlyMalesAndFemales = people.stream().noneMatch(person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender));
        System.out.println(arrayContainsFemales);
        System.out.println("*******************************************************************************");




    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }



    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
