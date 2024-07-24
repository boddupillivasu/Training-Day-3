package com.scanner.java;

import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("the int value:");
//        int value = scanner.nextInt();
//        System.out.println("the String is:");
//        String value1 = scanner.next();
//        System.out.println("the double value:");
//        Double du = scanner.nextDouble();

        //System.out.println("-- the values are --");
//        System.out.println("the int value:" + value);
//        System.out.println("the String is:" + value1);
//        System.out.println("the double value:" + du);
        int n = scanner.nextInt();
        // in this method does not exit the value
       // scanner.nextInt();
        // it prints string also
        scanner.nextLine();

        String name = scanner.nextLine();
        System.out.println(name);


    }
}
