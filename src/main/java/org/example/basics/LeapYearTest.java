package org.example.basics;

import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("Year is Leap year");
        }
        else if(year%100==0 && year%400==0){
            System.out.println("year is Leap year");
        }
        else {
            System.out.println("year is not leap year");
        }
        sc.close();
    }
}
