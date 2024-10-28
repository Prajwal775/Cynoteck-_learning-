package FunctionalProgramming;

import java.util.List;

public class FP1Structured {

    public static void main(String[] args) {

        printAllNumbers(List.of(2,5,6,4,88,2,44,3));

    }

    private static void printAllNumbers(List<Integer> integers) {

        for(int num:integers)
        {
            System.out.print(num+ " ");
        }
    }

}
