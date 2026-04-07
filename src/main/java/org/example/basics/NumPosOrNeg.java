package org.example.basics;

import java.util.Scanner;

public class NumPosOrNeg {
    public static void main(String[] args) {
        while(true) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter any number between -998 to 999 and enter 999 to exit: ");
            int num = sc.nextInt();
            if(num==999){
                System.out.println("Exiting loop");
                break;
            }
            if (num > 0) {
                System.out.println("Positive Number");
            } else if (num < 0) {
                System.out.println("Negative Number");
            } else {
                System.out.println("Number is zero");
            }
        }
    }
}
