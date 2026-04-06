package org.example.basics;

public class SwapNum {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int temp;

        temp=a;
        a=b;
        b=temp;
        System.out.println("Swap number with 3rd variable");
        System.out.println("Swap \"a\" "+a+" "+"\"b\" "+b);
        SwapNum.swapNumWithout3rdVariable(10,20);
    }

    static void swapNumWithout3rdVariable(int a, int b){

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap Without 3rd Variable: \"a\" "+ a+ "\t"+"\"b\" "+b);
    }
}
