package com.shivachi.functioninterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "9999");

        getCustomer(customer);

        getCustomerV2(customer, true);

        getCustomerV2(customer, false);

        getCustomerConsumer.accept(customer);

        getCustomerConsumerV2.accept(customer, true);

        getCustomerConsumerV2.accept(customer, false);

    }

    static void getCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + "," + "thank you for registering the phone number " + customer.customerPhoneNumber);
    }

    static void getCustomerV2(Customer customer, Boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + "," + "thank you for registering the phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "***************"));
    }

    static Consumer<Customer> getCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + "," + "thank you for registering the phone number " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> getCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName + "," + "thank you for registering the phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "***********"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }


    }
}
