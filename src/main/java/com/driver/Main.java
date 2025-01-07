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
// Task 1: Create a class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B bObj = new B();
        System.out.println(bObj.meth()); // This should print: "Invoking method from class A"

        // Task 4: Override method meth of class A in class B
        class B extends A {
            @Override
            public String meth() {
                return "Method is overridden in Extended class B";
            }
        }

        // Task 5: Call this overridden method from object of class B
        B bObjOverridden = new B();
        System.out.println(bObjOverridden.meth()); // This should print: "Method is overridden in Extended class B"
    }
}
