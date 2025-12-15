package datatype.com;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Enter the grade of the student : ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        if (grade == 'A') {
            System.out.println("First Grade");
        } else if (grade == 'B') {
            System.out.println("Second Grade");
        } else if (grade == 'C') {
            System.out.println("Third Grade");
        } else if (grade == 'D') {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid");
        }
    }
}
