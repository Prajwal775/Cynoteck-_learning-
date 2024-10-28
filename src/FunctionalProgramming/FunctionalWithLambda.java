package FunctionalProgramming;

import java.util.List;

public class FunctionalWithLambda {

    public static void main(String[] args) {

        List<Integer> integers = List.of(2, 5, 6, 4, 88, 2, 44, 3);
        printAllOddNumbersFunctionalWay(integers);

    }
//    public static boolean isEven(int num)
//    {
//        return num%2==0;
//    }
    private static void printAllNumbersFunctionalWay(List<Integer> integers) {

        integers.stream().forEach(System.out::print);//method reference
    }
    private static void printAllEvenNumbersFunctionalWay(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 ==0)//lambda expression
        .forEach(System.out::println);//method reference

    }
    private static void printAllOddNumbersFunctionalWay(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 !=0)//lambda expression
                .forEach(System.out::println);//method reference

    }


}
