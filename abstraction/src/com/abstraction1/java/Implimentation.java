package com.abstraction1.java;

public class Implimentation implements MyInterface {

    @Override
    public int addition(int a, int b, int c) {
        System.out.println("this is a int method");
        return a + b + c;
    }

    @Override
    public int sumOfTenNumber(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++)

            sum = sum + i;
        System.out.println("the sum is :" + sum);

        return sum;
    }

    public static void main(String[] args) {
        Implimentation implimentation;
        implimentation = new Implimentation();
        implimentation.sumOfTenNumber(10);
        System.out.println(implimentation.addition(10, 229, 332));

    }
}




