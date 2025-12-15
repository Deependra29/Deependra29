package com.oops.constructor;

public class Main2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Deependra", 26);
        Student1 s2 = new Student1("Monty", 26);
        System.out.println("Name: " + s1.name + " Age : " + s1.age);
        System.out.println("Name2: " + s2.name + " Age2 : " + s2.age);
    }
}

class Student1 {
    String name;
    int age;

    Student1(String n, int a) {
        name = n;
        age = a;
        System.out.println("Student Data :");
    }
}
