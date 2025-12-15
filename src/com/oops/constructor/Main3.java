package com.oops.constructor;

public class Main3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Deependra", 101);
        Student3 s2 = new Student3(s1); // Copy Constructor is called here

        System.out.println("Name of s1: " + s1.name + ", ID of s1: " + s1.id);
        System.out.println("Name of s2: " + s2.name + ", ID of s2: " + s2.id);
    }
}

class Student3 {
    String name;
    int id;

    // Normal Constructor
    Student3(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Student3(Student3 s) {
        this.name = s.name;
        this.id = s.id;
    }
}
