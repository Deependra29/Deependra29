package datatype.com;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter the age of the person: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input >= 25 && input <= 36) {
            System.out.println("The Person is Eligible for IAS Exam");
        } else {
            System.out.println("The Person is not Eligible for IAS Exam");
        }
    }
}
