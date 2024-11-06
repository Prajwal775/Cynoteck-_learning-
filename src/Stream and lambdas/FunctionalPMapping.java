package Advance.FunctionalProgramming;

import java.util.List;

public class FunctionalPMapping {

    public static void main(String[] args) {

        List<Integer> integers = List.of(2, 5, 6, 4, 88, 2, 44, 3);
        printAllSquaresNumbers(integers);
    }



    private static void printAllSquaresNumbers(List<Integer> integers) {

        integers.stream()
                .map(number->number * number)
        .forEach(System.out::println);//method reference

    }

}
