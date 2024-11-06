package Advance.FunctionalProgramming;

import java.util.List;

public class FPStructured {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 5, 6, 4, 88, 2, 44, 3);
        printAllEvenNumbers(numbers);
    }

    private static void printAllNumbers(List<Integer> integers) {

        for(int num:integers)
        {
            System.out.print(num+ " ");
        }
    }

    private static void printAllEvenNumbers(List<Integer> integers) {

        for(int num:integers)
        {
            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }

}
