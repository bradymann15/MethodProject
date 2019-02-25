package com.LickingHeights;

public class Main {

    public static void main(String[] args) {

    printGreeting();
    printGreetings("Lamp");
    int a=17;
    int b=24;
    int c= multiply(a,b);
    }

    public static void printGreeting(){
        System.out.println("Hello World");
    }

    public static void printGreetings(String noun){
        System.out.println("Hello "+noun);
    }

    public static int multiply(int firstNumber, int secondNumber){

        return firstNumber * secondNumber;
    }


}
