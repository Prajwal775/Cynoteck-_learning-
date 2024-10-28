package FunctionalProgramming;

import java.util.List;
import java.util.stream.Stream;

public class Exercise7 {

    public static void main(String[] args) {


//        jshell > List < Integer > numbers = List.of(2, 5, 6, 4, 88, 2, 44, 3);
//        numbers ==> [2, 5, 6, 4, 88, 2, 44, 3]
//
//        jshell > numbers
//        numbers ==> [2, 5, 6, 4, 88, 2, 44, 3]
//
//        jshell > numbers.stream().reduce(0, (x, y) -> x + y)
//        $3 ==>154

//        jshell > List < Integer > number = List.of(2, 5, 6, 4, 8, 2, 4, 3);
//        number ==> [2, 5, 6, 4, 8, 2, 4, 3]
//
//        jshell > number.stream().map(x -> x * x).reduce(0, Integer::sum);
//        $5 ==>174
//
//        jshell > number.stream().map(x -> x * x * x).reduce(0, Integer::sum)
//        $6 ==>1024

        List < Integer > number = List.of(2, 5, 6, 4, 8, 2, 4, 3);

        int sumOfSquares = number.stream().map(x -> x * x).reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares); // Output: 174

        int sumOfCubes =number.stream().map(x -> x * x * x).reduce(0, Integer::sum);
        System.out.println("Sum of cubes: " + sumOfCubes); // Output: 1024


    }
}
