package com.programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
//        printAllNumberInList(numbers);
        System.out.println("EVEN");
        printEvenNumberInList(numbers);
        System.out.println("ODD");
        printOddNumberInList(numbers);
        System.out.println("SQRT");
        printSquareNumberInList(numbers);
    }

//    private static void print(int number){
//        System.out.println(number);
//    }
    private static void printAllNumberInList(List<Integer> numbers){
        //WHat to do --> The first thing we thing
        // about in a functional approach is the what to do ..
        //first we convert it into a stream of elements.
        //Using Method Reference
        numbers.stream()
                .forEach(System.out::println);
}
private static boolean isEven(int number){
        return number%2 == 0;
}
private static boolean isOdd(int number){
        return number%2 == 1;
}



    private static void printEvenNumberInList(List<Integer> numbers){
        numbers.stream()
               // .filter(FP01Functional::isEven)  //Method Reference
//                MR  refers to code defined some where else

                //Using Lambda Expr.. is a simple way to define another method
                //by default if you have just one statement in a lambda it will return the value back
                //lambda checks what is the argument and what do you want to return
                //number -> number%2 == 0
                //                Lambda  refers to code defined here
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);
    }

    public static void printOddNumberInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2== 1 )
                .forEach(System.out::println);
    }

    public static void printSquareNumberInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2== 1 )
                .map(n -> n*n)
                .forEach(System.out::println);
    }

}
