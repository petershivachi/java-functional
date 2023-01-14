package com.shivachi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
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
                new Person("Mary", Gender.FEMALE)
        );

        System.out.println("********************************************************************************************");

        System.out.println("IMPERATIVE APPROACH");

//        Imperative Approach
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        };

        System.out.println("********************************************************************************************");

        System.out.println("DECLARATIVE APPROACH*");

        //    Declarative Approach
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

        System.out.println("********************************************************************************************");
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
        MALE, FEMALE
    }
}