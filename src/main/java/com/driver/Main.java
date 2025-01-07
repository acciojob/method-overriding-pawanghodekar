package com.driver;

/*
public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public  static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();

    }

}

*/

// Task 1: Create class A
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B extending class A
class B extends A {
    // Task 4: Override method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth from class A
        A objA = new A();
        System.out.println(objA.meth());

        // Create object of class B and call method meth
        B objB = new B();
        System.out.println(objB.meth());
    }
}

