package com.describe.a;

public class B {
    A ob = new A();
    public void say() {
        // n4 is private, which can only be used in subclass
        System.out.println(ob.n1 + ob.n2 + ob.n3);
    }
}
