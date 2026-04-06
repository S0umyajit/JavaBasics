package org.example.basics;

public class IncrementEx {

    public static void main(String[] args) {
        int a=3;
        int b=a++;
        int z=b;

        int aa[]={12,23,45};
        int index=0;
        try {
            System.out.println("index " + index + " " + aa[index++]);
            System.out.println("index " + index + " " + aa[index++]);
            System.out.println("index " + index + " " + aa[index++]);
            System.out.println("index " + index + " " + aa[index++]);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array Index Out of Bound "+ ae.getMessage());
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(z);
    }
}
