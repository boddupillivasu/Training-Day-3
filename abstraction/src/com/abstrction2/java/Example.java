package com.abstrction2.java;

public    abstract class Example  implements Mytest {

    @Override
    public int add(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++)
            sum = sum + i;
        return sum;
    }


    @Override
    public String sumOfNumbers(String a, String b, String c) {
        String fullName = a + " " + b + " " + c;

        return fullName;
    }

    //   @Override
//  public void m1() {
//
//    }
    public void m1() {
        System.out.println("this is m1 method");
    }
}

