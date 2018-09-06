package com.package1;

/**
 * Created by rohan on 9/6/18.
 */
public class BaseClass {

    public int a = 5;
    int b = 10;

    public void printVariables(){
        System.out.println("a from " + this.getClass().getSimpleName() + " is " + a);
        System.out.println("b from " + this.getClass().getSimpleName() + " is " + b);
    }
}
