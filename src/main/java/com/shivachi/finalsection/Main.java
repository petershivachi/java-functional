package com.shivachi.finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("John", "Montana", null);

        hello("John", null, value -> System.out.println("No lastname provided for " + value));

        hello2("John", "Montana", null);

        hello2("John", null, () -> System.out.println("No last name was provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);

        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);

        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }
}
