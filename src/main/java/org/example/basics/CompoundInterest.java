package org.example.basics;

public class CompoundInterest {

    public static void main(String[] args) {

        int p=100;
        int rate=2;
        int year=4;

        double compoundInt=p*Math.pow((1+ (double) rate /100),year);
        System.out.println(compoundInt);
    }
}
