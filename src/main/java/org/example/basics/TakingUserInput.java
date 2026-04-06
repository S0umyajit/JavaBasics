package org.example.basics;
import java.util.Scanner;
public class TakingUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        System.out.println(a);
        int i=sc.nextInt();
        System.out.println(i);
        String j=sc.next();
        System.out.println(j);

    }
}
