package com.programming;

import java.util.List;

public class FP03Functional {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring-Boot", "Api", "MicroServices", "AWS", "PCF", "Azure");
//        printAllCOurse(courses);
        printSCourse(courses);
        System.out.println("Choose");
        printSpringCourse(courses);
    }

    private static void printAllCOurse(List<String> courses){
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printSCourse(List<String> courses){
        courses.stream()
                .filter(course->course.length()<5)
                .forEach(System.out::println);
    }

    private static void printSpringCourse(List<String> courses){
        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);
    }
}
