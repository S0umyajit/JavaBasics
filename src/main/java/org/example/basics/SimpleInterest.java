package org.example.basics;

public class SimpleInterest {
    public static void main(String[] args) {
//        P (Principal): The initial amount of money.
//        R (Rate): The annual interest rate (in percentage).
//        T (Time): The duration in years.
//        If you have 1,000 (Principal) at a 5% (Rate) for 2 years (Time):

        int principal=1000;
        double rateParcentage=5.0;
        int timeInYear=2;

        double simpleInterest=(principal*rateParcentage*timeInYear)/100;
        System.out.println(simpleInterest);
    }
}
