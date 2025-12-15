package com.oops.constructor;

public class Client {
    public static void main(String[] args) {
        Student4 student = new Student4();

        student.age = 21;
        student.psp = 90.0;

        student.doSomething(student);
        System.out.println("Student age " + student.age);
        System.out.println("Student psp "+ student.psp);

    }
}
