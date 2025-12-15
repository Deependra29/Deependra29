package com.oops.constructor;

public class Main {
    public static void main(String[] args) {
        // Object creation -> constructor run automatically
        Student s1 = new Student();
        s1.show();
    }
}

class Student {
    // Non-parametrized constructor(no arguments)
    Student() {
        System.out.println("This is non-parametrized constructor");
    }

    void show() {
        System.out.println("Welcome Deependra");
    }
}

