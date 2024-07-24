package com.abstrction4.java;

public class ExampleOnInterface3 extends Myint3 implements Myint4 {

    @Override
    public void m2() {
        System.out.println("this is a method m2");
    }

    @Override
    public String sayHello(String m) {

        return " this is string method:" + m;
    }

    public static void main(String[] args) {
        ExampleOnInterface3 exampleOnInterface3;
        exampleOnInterface3 = new ExampleOnInterface3();
        exampleOnInterface3.m1();
        exampleOnInterface3.m2();
        int value = exampleOnInterface3.addition(10, 29);
        System.out.println("the value is:" + value);
        String name = exampleOnInterface3.sayHello("true");
        System.out.println("the name is:" + name);
        System.out.println("the college name:"+Myint4.collegeName);
        System.out.println("the college id :"+Myint4.collogeId);
    }
}