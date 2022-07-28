package com.programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers =  List.of(12,9,13,4,6,2,4,12,15);
//        printAllNumberInList(numbers);
        printEvenNumberInList(numbers);

    }

    private static void printAllNumberInList(List<Integer> numbers){
        //How to Loop Number --> The first thing we thing
        // about in a structured approach is the how..
        for(int number : numbers){
            System.out.println(number);
        }
    }

    private static void printEvenNumberInList(List<Integer> numbers){
        //How to print number
        for(int number : numbers ){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }


}
