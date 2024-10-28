package FunctionalProgramming;

import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        List<String> course = List.of("mca","bca","btech","bsc","bcom","b.ed");
        ;
        printString(course);

    }

    private static void printString(List<String> courses)
    {

        //courses.stream().forEach(System.out::print);//method reference way
        // another way to add spaces if wanted in same line
        //with the help of lambda expresiions

        courses.stream().forEach(course -> System.out.print(course+ " "));
    }


}
