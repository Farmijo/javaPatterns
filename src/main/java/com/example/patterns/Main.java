package com.example.patterns;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        var sandwich = new Sandwich.Builder(1).cheeseSlices(2).build();
        System.out.print(sandwich);
        System.out.println("eoooeooe");
    }
}

