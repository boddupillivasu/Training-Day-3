package com.Abstraction3.java;

public class ExampleOninterace1 implements Interface23{


    @Override
    public int addition(int a, int b, int c) {
        int sum = 0;
        int [] numbers ={a,b,c};

        int i;
        for (i = 0; i< numbers.length;i++) {
            sum = sum + numbers[i];
        }
            return sum;
        }

        @Override
        public String sayHello (String m){
            return "string method:" + m;
        }

        @Override
        public void display () {
            System.out.println("hellojava");
        }

        public static void main (String[]args){
            ExampleOninterace1 exampleOninterace1;
            exampleOninterace1 = new ExampleOninterace1();
            int sum = exampleOninterace1.addition(10, 10, 10);
            System.out.println("the sum is:" + sum);
            exampleOninterace1.display();
            String val = exampleOninterace1.sayHello("hello java");
            System.out.println("the value :" + val);
        }
    }



