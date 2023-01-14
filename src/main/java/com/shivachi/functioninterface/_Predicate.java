package com.shivachi.functioninterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Normal functions");
        System.out.println(isPhoneNumberValid("07123456789"));
        System.out.println(isPhoneNumberValid("0712345678"));
        System.out.println(isPhoneNumberValid("09123456789"));
        System.out.println("Predicate Functions");
        System.out.println(isPhoneNumberValidPredicate.test("07123456789"));
        System.out.println(isPhoneNumberValidPredicate.test("0712345678"));
        System.out.println(isPhoneNumberValidPredicate.test("09123456789"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("07123456789"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("0712345678"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumberThree).test("09123456789"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree = phoneNumber -> phoneNumber.contains("3");

    static String phoneNumber(String phoneNumber){
        return phoneNumber;
    }

//    static BiPredicate<String>


}
