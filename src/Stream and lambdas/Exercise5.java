package Advance.FunctionalProgramming;

import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(2, 5, 6, 4, 8, 2, 4, 3);
        printAllOddNumbersFunctionalWay(integers);
    }
    private static void printAllOddNumbersFunctionalWay(List<Integer> integers) {

        integers.stream()
                //. filter(number -> number % 2 !=0)//lambda expression
                .map(number->number*number*number)
                .forEach(System.out::println);//method reference

    }


}
