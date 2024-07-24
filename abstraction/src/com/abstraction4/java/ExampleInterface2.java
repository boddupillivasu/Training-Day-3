package com.abstraction4.java;

public class ExampleInterface2  implements Myint1,Myint2{
    @Override
    public void m1() {
        System.out.println("this is m1 meyhod");
    }

    @Override
    public String sayHello(String m) {
        return "this is say hello Method"+m;
    }

    @Override
    public void m2() {
        System.out.println("this is m2 method");
    }

    @Override
    public int addition(int a, int b) {

        return a+b;
    }

    public static void main(String[] args) {
        ExampleInterface2 exampleInterface2;
        exampleInterface2 = new ExampleInterface2();
        exampleInterface2.m1();
        exampleInterface2.m2();
       String value = exampleInterface2.sayHello("m1");
        System.out.println("the method is:"+value);

         int num =exampleInterface2.addition(10,435);
        System.out.println("this is int method:"+num);
    }
}
