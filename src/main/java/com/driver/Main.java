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

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
    }
}

