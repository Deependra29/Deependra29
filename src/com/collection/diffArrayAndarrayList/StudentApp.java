package com.collection.diffArrayAndarrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        String [] subjects = {"Math", "Science", "English"};

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Jennifer"));
        students.add(new Student(3, "Zak"));

        System.out.println("The list of subjects: ");
        for(String s : subjects){
            System.out.println(s);
        }
        System.out.println("\nThe list of students details: ");
        for(Student s : students){
            System.out.println(s.id + "-" + s.name);
        }


        students.add(new Student(4, "Terri"));
        System.out.println("\nThe New list of students details: ");
        for(Student s : students){
            System.out.println(s.id + "-" + s.name);
        }
    }
}
