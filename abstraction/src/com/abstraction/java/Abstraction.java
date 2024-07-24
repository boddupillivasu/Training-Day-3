package com.abstraction.java;

public class Abstraction implements HelloApp {

    @Override
    public void add(int a, int b) {
        System.out.println("this is a int method");
        System.out.println("the int value :"+(a+b));
    }

    @Override
    public void sub(float a, float b) {
        System.out.println("this is a float method");
        System.out.println("the subtraction is:"+(a-b));

    }

    @Override
    public String hello(String say) {

        return "hello world"+ say;
    }
}
