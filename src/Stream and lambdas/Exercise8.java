package Advance.FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

    private static List<Integer> squarelist(List<Integer> number) {

        return number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
    private static List<Integer> evenlist(List<Integer> number) {

        return number.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> courselen(List<String> courses) {
        return courses.stream().map(x->x.length()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> number = List.of(2, 5, 6, 4, 8, 2, 4, 3,11,15,9,7,10);

        List<Integer> squareOfNumbers = squarelist(number);
        List<Integer> evenNumbers = evenlist(number);

        List<String> courses = List.of(
                "MCA - Master of Computer Applications",
                "BCA - Bachelor of Computer Applications",
                "B.Tech - Bachelor of Technology",
                "B.Sc - Bachelor of Science",
                "B.Com - Bachelor of Commerce",
                "B.Ed - Bachelor of Education",
                "Advanced Studies"
        );

        List<Integer> courselength = courselen(courses);

        System.out.println("course length is :" + courses + courselength);

        //System.out.println(evenNumbers);

        //System.out.println(squareOfNumbers);
    }


}

