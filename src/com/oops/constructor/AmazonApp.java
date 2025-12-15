package com.oops.constructor;

public class AmazonApp {
    public static void main(String[] args) {
        User c1 = new User("Deependra");
        User c2 = new User("Deependra", "deependra@gmail.com");
        User c3 = new User("Deependra", "deependra@gmail.com", "9876543210");
        User c4 = new User("Deependra", "deependra@gmail.com", "9876543210", "107, MG road, Bengaluru");

    }
}

class User {
    String name;
    String email;
    String PhoneNumber;
    String address;

    User(String name) {
        this.name = name;
        System.out.println("User registered with name: " + name);
    }

    User(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("User registered with name and email: " + name + ", " + email);
    }

    User(String name, String email, String PhoneNumber) {
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        System.out.println("User registered with name, email and phone number: " + name + ", " + email + ", " + PhoneNumber);
    }

    User(String name, String email, String PhoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.address = address;
        System.out.println("User registered with name, email, phone number and address: " + name + ", " + email + ", " + PhoneNumber + ", " + address);
    }
}