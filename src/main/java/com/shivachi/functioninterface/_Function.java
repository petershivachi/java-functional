package com.shivachi.functioninterface;

import java.net.Inet4Address;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
//        Function - Takes 1 argument and produces one result.
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndMultiplyTen = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addByOneAndMultiplyTen.apply(4));

//        BIFunction - Takes 2 arguments and produces one result
        System.out.println(incrementByOneAndMultiplyByNumberFunction(4, 100));

        System.out.println(incrementByOneAndMultiplyByNumberBIFunction.apply(4, 100));

    }

    static int incrementByOne(int number){
        return number + 1;
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static  Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static int incrementByOneAndMultiplyByNumberFunction(int numberToIncrementByOne, int numberToMultiplyBy){
        return (numberToIncrementByOne + 1) * numberToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByNumberBIFunction = (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
