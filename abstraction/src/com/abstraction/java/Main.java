package com.abstraction.java;

public class Main extends Abstraction {
    public static void main(String[] args) {
        // one way to declare object
        Main main;
        main = new Main();

        Abstraction abstraction;
        abstraction = new Main();

        main.add(10,37);
        main.sub(73.6f,636.7f);
        main.hello("vasu naidu");

        abstraction.add(10,37);
        abstraction.sub(73.6f,636.7f);
        abstraction.hello("vasu naidu");



            }
}
