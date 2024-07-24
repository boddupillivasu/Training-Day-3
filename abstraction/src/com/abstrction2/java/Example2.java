package com.abstrction2.java;

public class Example2 extends Example {
//    @Override
//    public void m1() {
//        System.out.println("this is m1 method");
//    }

    public static void main(String[] args) {
//        Examplele2 example;
//        example = new Example2();
        Example2 example2;
        example2 = new Example2();
        System.out.println("the sum of num:"+example2.add(10));
        example2.m1();
        System.out.println(example2.sumOfNumbers("vasu","areef","hello java"));

    }
}
