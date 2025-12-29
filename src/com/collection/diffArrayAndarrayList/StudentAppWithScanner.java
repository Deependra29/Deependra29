package com.collection.diffArrayAndarrayList;

import java.util.Scanner;

public class StudentAppWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = sc.nextInt();
        sc.nextLine();

        String [] subjects = new String[count];
        for(int i=0; i<count; i++){
            System.out.println("\n Enter the subject of the Students: " + (i+1));
            subjects[i] = sc.nextLine();
        }
        System.out.println("The list of subjects: ");
        for(String s : subjects){
            System.out.println(s);
        }
    }
}
