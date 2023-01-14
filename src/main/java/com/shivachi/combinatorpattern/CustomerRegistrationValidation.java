package com.shivachi.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidation extends Function<Customer, CustomerRegistrationValidation.ValidationResult> {
    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        IS_NOT_ADULT
    }

    static CustomerRegistrationValidation isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidation isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+254") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidation isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()  > 18 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;
    }

    default CustomerRegistrationValidation and (CustomerRegistrationValidation other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }
}
