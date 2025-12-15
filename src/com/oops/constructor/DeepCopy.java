package com.oops.constructor;

public class DeepCopy {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Deependra", new Address1("Bhopal"));
        Employee1 e2 = new Employee1(e1);

        // Change e2's city
        e2.getAddress().setCity("Chennai");

        System.out.println("e1 city: " + e1.getAddress().getCity()); // Bhopal
        System.out.println("e2 city: " + e2.getAddress().getCity()); // Chennai
    }
}

class Address1 {
    private String city;

    public Address1(String city) {
        this.city = city;
    }

    //Getter & Setter
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Employee1 {
    private String name;
    private Address1 address;

    public Employee1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy Constructor using getters & setters
    public Employee1(Employee1 source) {
        this.name = source.name; // copy primitive
        this.address = new Address1(source.getAddress().getCity());
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress1(Address1 address) {
        this.address = address;
    }
}