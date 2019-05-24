package com.programs;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int a,b,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a:");
        a = in.nextInt();
        System.out.println("Enter the value of b:");
        b = in.nextInt();

        try {
            d = a/b;
            System.out.println("The result: "+d);
        } catch(ArithmeticException ae) {
            System.out.println("Division by zero not allowed");
        }
    }
}
