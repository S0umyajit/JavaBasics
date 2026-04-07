package org.example.basics;

public class IfElseTest {
    public static void main(String[] args) {
        boolean isSeniorCitizen=false;
        boolean isAdult=false;

//        if(isSeniorCitizen){
//            System.out.println("hello senior");
//        }
//        // below we can write like this also we can use "else if"
//        else{
//            if(isAdult){
//                System.out.println("hello Adult");
//            }
//            else{
//                System.out.println("hello child");
//            }
//        }
        if(isSeniorCitizen){
            System.out.println("hello senior");
        }
        else if(isAdult) {
            System.out.println("hello Adult");
        }
            else{
                System.out.println("hello child");
            }
        }
    }

