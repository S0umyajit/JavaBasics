package org.example.basics;

import java.util.Scanner;

public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter three Numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (a >= b && a >= c) {
                    System.out.println("a is greatest " + a);
                } else if (b > a && b >= c) {
                    System.out.println("b is greatest " + b);
                } else {
                    System.out.println("c is greatest " + c);
                }
            } catch (Exception e) {
                System.out.println("Please enter integer number"+e);
                sc.next();
            }
            System.out.println("Enter q to quit the loop or c to continue");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("c")){
                System.out.println("Continue to Loop!!!!!!");
                continue;
            }
            else if(choice.equalsIgnoreCase("q")){
                System.out.println("Exiting the loop!!!!!");
                break;
            }
            sc.close();
        }
    }
}
