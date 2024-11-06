package Advance.FunctionalProgramming;

import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        List<String> course = List.of("mca is better","bCa is good","btech","bsc","bcom","b.ed");
        ;
        printString(course);

    }

    private static void printString(List<String> courses)
    {
        courses.stream()
                .filter(course-> course.toLowerCase().contains("bca"))//to lowercase checks for case-insensitive match
                .forEach(course -> System.out.print(course+ " "));
    }


}
