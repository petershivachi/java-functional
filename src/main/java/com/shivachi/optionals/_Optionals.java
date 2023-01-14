package com.shivachi.optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        Optional.ofNullable(null).ifPresent(System.out::println);

        Optional.ofNullable("Hello World").ifPresent(System.out::println);

        Optional.ofNullable("pshivachi@emtechhouse.co.ke").ifPresent(email -> {
            System.out.println("Sending email to " + email);
        });

        Optional.ofNullable("pshivachi@emtechhouse.co.ke").ifPresentOrElse(email -> {
            System.out.println("Sending email to " + email);
        }, () -> {
            System.out.println("No email found");
        });


    }
}
