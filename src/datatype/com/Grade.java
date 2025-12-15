package datatype.com;

import javax.swing.*;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Entre grade :");
            char grade = sc.next().charAt(0);
            if (grade == 0) {
                System.out.println("ended");
                break;
            }
            switch (Character.toUpperCase(grade)) {

                case 'A':
                    System.out.println("First division");
                    break;
                case 'B':
                    System.out.println("Second division");
                    break;
                case 'C':
                    System.out.println("Third division");
                    break;
                case 'D':
                    System.out.println("Failed");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
