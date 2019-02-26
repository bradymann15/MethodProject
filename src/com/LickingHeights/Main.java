package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        //method1
        printGreeting();
        //method2
        printGreetings("Lamp");
        //method3
        int a = 17;
        int b = 24;
        int c = multiply(a, b);
        System.out.println(c);
        double d = 42;
        //method4
        double e = 156;
        double f = divide(e, d);
        System.out.println(f);
        //method5
        int g = 57;
        int h = 39;
        int j = max(g, h);
        System.out.println(j);
        //method6
        String word1 = "Baby";
        String word2 = "Boomer";
        String word3 = switchWords(word1, word2);
        System.out.println(word3);

    }

    public static void printGreeting() {
        System.out.println("Hello World");
    }

    public static void printGreetings(String noun) {
        System.out.println("Hello " + noun);
    }

    public static int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public static double divide(double firstInt, double secondInt) {

        return firstInt / secondInt;
    }

    public static int max(int firstInteger, int secondInteger) {

        if (firstInteger > secondInteger)
            return firstInteger;

        else {
            return secondInteger;
        }

    }

    public static String switchWords(String word1, String word2){

        return word2 + " " + word1;
    }
}
