package com.oops.constructor;

public class Test {
    public static void main (String[] args){
        Demo obj = new Demo(); // Constructor is called here
        System.out.println(obj.name);
    }
}
class Demo {
    String name;

    Demo() {
        name = "Deependra";
    }
}
