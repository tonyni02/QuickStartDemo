package com.tony;

public class Main {

    void test1(String abc)
    {
        String testString = abc;
        return;
    }
    public static void main(String[] args) {

	// write your code here
        String testString;
        testString = "Tony";

        new Main().test1("Hello");
        System.out.println("Hello World!");
    }
}
