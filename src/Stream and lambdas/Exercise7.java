package Advance.FunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Exercise7 {

    public static void main(String[] args) {



        List<String> course = List.of("mca is better","bCa is good","btech","bsc","bcom","b.ed","advance");
        //course.stream().sorted().forEach(System.out::println);



        List < Integer > number = List.of(2, 5, 6, 4, 8, 2, 4, 3);


        course.stream().sorted(Comparator.comparing(x-> x.length())).forEach(System.out::println);

        //number.stream().distinct().forEach(System.out::println);

//        course.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//        System.out.println();
//        System.out.println("reverse order");
//        course.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        System.out.println();
//
//        number.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("reverse order");
//
//        number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        System.out.println();


//        System.out.println("sorted form");
//        number.stream().sorted().forEach(System.out::println);
//        System.out.println("distinct sorted form");
//        number.stream().distinct().sorted().forEach(System.out::println);
//
//
//        int sumOfSquares = number.stream().map(x -> x * x).reduce(0, Integer::sum);
//        System.out.println("Sum of squares: " + sumOfSquares); // Output: 174
//
//        int sumOfCubes =number.stream().map(x -> x * x * x).reduce(0, Integer::sum);
//        System.out.println("Sum of cubes: " + sumOfCubes); // Output: 1024


    }
}
