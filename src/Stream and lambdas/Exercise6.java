package Advance.FunctionalProgramming;

import java.util.List;

public class Exercise6 {

    public static void main(String[] args) {
        List<String> course=List.of("Mca","Bca","B.tech","It","Mba","Bachelor of Commerce","Hotel Management");

        printNumberOfCharacters(course);
    }

    private static void printNumberOfCharacters(List<String> course) {
         course.stream().map(courses-> courses+" " + courses.length())
                 .forEach(System.out::println);


    }


}
