package com.shivachi.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "+254712345678", "alice@gmail.com", LocalDate.of(2000, 1, 6));

        Customer customerOne = new Customer("John", "+256712345678", "alice@gmail.com", LocalDate.of(2000, 1, 6));

        Customer customerTwo = new Customer("Jane", "+254712345678", "alicegmail.com", LocalDate.of(2000, 1, 6));

        Customer customerThree = new Customer("Alice", "+254712345678", "alice@gmail.com", LocalDate.of(2006, 1, 6));

        CustomerValidatorService customerValidatorService = new CustomerValidatorService();

//        System.out.println(customerValidatorService.validateCustomerDetails(customer));

        CustomerRegistrationValidation.ValidationResult result = CustomerRegistrationValidation.isEmailValid().and(CustomerRegistrationValidation.isPhoneNumberValid()).and(CustomerRegistrationValidation.isAdult()).apply(customer);

        CustomerRegistrationValidation.ValidationResult result1 = CustomerRegistrationValidation.isEmailValid().and(CustomerRegistrationValidation.isPhoneNumberValid()).and(CustomerRegistrationValidation.isAdult()).apply(customerOne);

        CustomerRegistrationValidation.ValidationResult result2 = CustomerRegistrationValidation.isEmailValid().and(CustomerRegistrationValidation.isPhoneNumberValid()).and(CustomerRegistrationValidation.isAdult()).apply(customerTwo);

        CustomerRegistrationValidation.ValidationResult result3 = CustomerRegistrationValidation.isEmailValid().and(CustomerRegistrationValidation.isPhoneNumberValid()).and(CustomerRegistrationValidation.isAdult()).apply(customerThree);

        System.out.println("Customer One: " + result);

        System.out.println("Customer Two: " + result1);

        System.out.println("Customer Three: " + result2);

        System.out.println("Customer Four: " + result3);


    }
}
