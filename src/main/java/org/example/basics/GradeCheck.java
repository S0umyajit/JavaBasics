package org.example.basics;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Above 90%");
        } else if (marks>=75 && marks<90) {
            System.out.println("Above 75%");
        }
        else if (marks>=60 && marks<75) {
            System.out.println("Above 60%");
        }
        else if (marks>=30 && marks<60) {
            System.out.println("Above 30%");
        }
        else {
            System.out.println("Below 30%");
        }
    }
}
