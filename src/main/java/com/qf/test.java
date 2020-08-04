package com.qf;

public class test {
    public static void main(String [] args ){
        test1(1);
    }
    public static void test1(int i) {
        i++;
        test1(i);
        System.out.println(i);
    }

}
