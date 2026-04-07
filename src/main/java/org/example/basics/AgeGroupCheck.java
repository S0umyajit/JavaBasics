package org.example.basics;

import java.util.Scanner;

public class AgeGroupCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=60){
            System.out.println("senior citizen");
        }
        else if(age<60 && age>=20){
            System.out.println("Adult");
        } else if (age<20 && age>=13) {
            System.out.println("Teen");
        }
        else {
            System.out.println("Child");
        }
    }
}
