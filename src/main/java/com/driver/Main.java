package com.driver;

import com.driver.A;
import com.driver.B;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth());

        B objB = new B();
        System.out.println(objB.meth());
    }
}
