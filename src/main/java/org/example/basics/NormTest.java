package org.example.basics;

public class NormTest {
    public static void main(String[] args) {
        int i=12;
        int j=89;
        int a=13;
        int b=34;
        /* * Evaluation breakdown:
         * 1. "Result is: " + i -> "Result is: 12" (Concatenation)
         * 2. "Result is: 12" + j -> "Result is: 1289" (Concatenation)
         * 3. (a + b) -> 47 (Math Addition due to parentheses)
         * 4. "Result is: 1289" + 47 -> "Result is: 128947" (Final Concatenation)
         */
        System.out.println("Result is: "+i+j+(a+b));
    }
}
