package simpleFunc;

import java.util.Scanner;

public class FunctionOrMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            int res=sum();
            System.out.println(res);

            System.out.println("Do you want to continue: Yes/ No");
            String choice=sc.next();

            if(choice.equalsIgnoreCase("no")){
                System.out.println("Exiting!!!");
                break;
            }
        }
    }

    public static int sum(){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter first Number: ");
            int a = sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            int b = sc.nextInt();
            System.out.println("Enter your choice to perform: 1 for Addition, 2 for Substraction, 3 for Multiplication 4 for Division");
            int choiceYourOps = sc.nextInt();
            switch (choiceYourOps) {
                case 1:
                    return a + b;
                case 2:
                    return a - b;
                case 3:
                    return a * b;
                case 4:
                    if (b == 0) {
                        System.out.println("cannot divide by 0");
                        return 0;
                    }
                    return a / b;
                default:
                    System.out.println("Invalid choice");
                    return 0;
            }
    }
}
