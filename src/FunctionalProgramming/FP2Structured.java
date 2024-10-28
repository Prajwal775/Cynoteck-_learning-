package FunctionalProgramming;

import java.util.List;

public class FP2Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 6, 4, 87, 2, 44, 3);
        //int sum = sumOFAllNumbers(numbers);
        int sum = sumOFAllNumbersUsingFunctionalProgramming(numbers);
        System.out.println(sum);
    }
    private static int sumOFAllNumbers(List<Integer> integers) {
        int sum = 0;
        for (int num : integers) {
            sum += num;
        }
        return sum;
    }
    private static int sum(int a,int b)
        {
        return a+b;
        }
    private static int sumOFAllNumbersUsingFunctionalProgramming(List<Integer> integers) {
        //return integers.stream().reduce(0,FP2Structured::sum);
        //reduce is used combine the values of stream into 1 result
        //also if u want to avoid passing the function we can direclty use
        // return integers.stream().reduce(0,(x,y)->x+y);//also java provides an inbuilt function of sum in Integer Class
        return integers.stream().reduce(0,Integer::sum);
    }
}