package org.example.basics.loop;

public class WhileLoopPattern {
    public static void main(String[] args) {
//        checkFirstPattern();
        checkFirstPatternUsingWhile();
    }

    public static void checkFirstPattern(){
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void checkFirstPatternUsingWhile(){
        int i=0;
        while(i<5){
            System.out.print("* ");
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
