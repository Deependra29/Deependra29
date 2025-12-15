package com.oops.constructor;

public class ShallowCopy {
    public static void main(String[] args) {

        Address addr = new Address("Delhi");
        Employee emp1 = new Employee("Deependra", 26, addr);
        Employee emp2 = new Employee(emp1); // Shallow copy

        System.out.println("Before modifying address:");
        System.out.println("Employee 1: " + emp1.name + ", Age: " + emp1.age + ", City: " + emp1.address.city);
        System.out.println("Employee 2: " + emp2.name + ", Age: " + emp2.age + ", City: " + emp2.address.city);

        // Modifying the address of emp2
        emp2.address.city = "Bhopal";
        emp2.name = "Monty"; // primitive field change does not affect emp1
        System.out.println("\nAfter modifying address:");
        System.out.println("Employee 1: " + emp1.name + ", Age: " + emp1.age + ", City: " + emp1.address.city);
        System.out.println("Employee 2: " + emp2.name + ", Age: " + emp2.age + ", City: " + emp2.address.city);
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee {
    String name;
    int age;
    Address address;

    Employee(String name, int age, Address address) {
        this.name = name; //primitive String copied normally
        this.age = age; //primitive int copied normally
        this.address = address; //reference copied (shallow copy)
    }

    Employee(Employee source) {
        this.name = source.name; //primitive String copied normally
        this.age = source.age; //primitive int copied normally
        this.address = source.address; //reference copied (shallow copy)
    }
}
