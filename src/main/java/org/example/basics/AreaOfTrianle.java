package org.example.basics;

public class AreaOfTrianle {
    public static void main(String[] args) {
        int base=12;
        int height=14;
         // Use 1.0/2.0 (floating-point literals) to prevent Integer Division.
        // If we used (1/2), Java would truncate the result to 0 before multiplying.
        double areaOfTriangle=((1.0/2.0)*(base*height));
        System.out.println(areaOfTriangle);
    }
}
