package datatype.com;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        System.out.println("Enter the girl of the person: ");
        Scanner sc = new Scanner(System.in);
        int girlAge = sc.nextInt();
        System.out.println("Enter the Boys age : ");
        int boysAge = sc.nextInt();
        if(girlAge>=18 && boysAge>=22){
            System.out.println("The person is Eligible for Marriage");
        }else {
            System.out.println("The person is not Eligible for Marriage");
        }
    }
}
