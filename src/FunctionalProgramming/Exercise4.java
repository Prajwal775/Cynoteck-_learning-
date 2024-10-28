package FunctionalProgramming;

import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        List<String> course = List.of("mca is better","bCa is good","btech","bsc","bcom","b.ed","it");
        ;
        printString(course);

    }

    private static void printString(List<String> courses)
    {
        courses.stream()
                .filter(course-> course.length()<=4)
                .forEach(course -> System.out.print(course+ " "));
    }


}
