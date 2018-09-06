package com.package2;

import com.package1.BaseClass;

/**
 * Created by rohan on 9/6/18.
 */
public class OtherPackageClass {
    public void printVariables(){

        BaseClass baseclass = new BaseClass();

        System.out.println("a from " + this.getClass().getSimpleName() + " is " + baseclass.a);
//        System.out.println("b from " + this.getClass().getSimpleName() + " is " + baseclass.b);
    }
}
