package org.example.basics;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter Any Number to check if number is positive or negative: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            if (num % 2 == 0) {
                System.out.println("number is even");
                break;
            } else{
                System.out.println("number is odd");
                break;
        }
    }
    }
}
