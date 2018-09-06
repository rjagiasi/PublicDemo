package com.package1;

/**
 * Created by rohan on 9/6/18.
 */
public class ChildClass extends BaseClass {

    public void printVariables(){
        System.out.println("a from " + this.getClass().getSimpleName() + " is " + a);
        System.out.println("b from " + this.getClass().getSimpleName() + " is " + b);
    }

}
