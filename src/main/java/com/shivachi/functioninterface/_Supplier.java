package com.shivachi.functioninterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDbConnectionUrlSupplier.get());

        System.out.println(getDBConnectionUrls.get());
    }

    static public String getDBConnectionUrl(){
        return "jdbc://localhost:5306/users";
    }

    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:5306/users";

    static Supplier<List<String>> getDBConnectionUrls = () -> List.of("jdbc://localhost:5306/users", "jdbc://localhost:5306/users", "jdbc://localhost:5306/users", "jdbc://localhost:5306/users");
}
