package FunctionalProgramming;

import java.util.List;

public class FP1Functional{

    public static void main(String[] args) {

        printAllNumbersFunctionalWay(List.of(2,5,6,4,88,2,44,3));

    }

    public static void print(int num)
    {
        System.out.println(num);
    }
    private static void printAllNumbersFunctionalWay(List<Integer> integers) {

        integers.stream().forEach(FP1Functional::print);//method reference

    }
}
//        Traditional Way
//        Benefits:
//
//        Readability for Small Tasks: For simple iteration tasks, the for-each loop is immediately understandable, especially for those new to Java or functional programming.
//        Direct Control: The loop gives you direct access to each element and can make certain modifications easier (e.g., adding conditional logic without breaking functional flow).
//        Familiarity: Many Java developers are already familiar with loops, so the code might feel more intuitive without requiring a deeper understanding of streams or functional concepts.
//
//        Limitations:
//        Verbosity: The for-each loop is more verbose than the functional approach, particularly for more complex operations.
//        Imperative Style: This approach is more procedural and doesn’t encourage a declarative programming style, which can lead to more complex, nested logic in larger programs.
//        Example
//        for(int num:integers)
//        {
//            System.out.print(num+ " ");

//        Functional Approach
//        Benefits:
//
//        Conciseness: Streams and method references reduce boilerplate code, making the code more concise and easier to read, especially for more complex operations.
//        Declarative Style: The functional approach promotes a declarative style, focusing on what to do rather than how to do it. This can improve readability and maintainability in more complex code.
//        Chaining and Composition: Streams allow chaining multiple operations, like filtering or mapping, which makes complex data processing tasks cleaner and more modular.
//        Parallel Processing: The stream API can be parallelized (e.g., integers.parallelStream().forEach(...)), enabling better performance for large datasets by easily utilizing multiple cores.
//        Limitations:
//
//        Overhead for Simple Tasks: For basic iteration tasks, the functional approach might seem overly complex or unnecessary.
//        Initial Learning Curve: Understanding streams and method references can be challenging for developers new to functional programming concepts in Java.


