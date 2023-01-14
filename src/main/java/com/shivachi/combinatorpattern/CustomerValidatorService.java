package com.shivachi.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.contains("+254");
    }

    private  boolean isCustomerAnAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean validateCustomerDetails(Customer customer){
        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isCustomerAnAdult(customer.getDob());
    }

}
