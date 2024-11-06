package Advance;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {


    public static void main(String[] args) {
        List<Integer> number = List.of(2, 5, 6, 4, 8, 2, 4, 3, 11, 15, 9, 7, 10);


        Predicate<Integer> iseven=x->x%2==0;
        Predicate<Integer> iseven2=new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer x)
            {
                return x%2==0;
            }
        };
        Function<Integer,Integer> square=x->x*x;
        Consumer <Integer> sysconsumer=System.out::println;;


//        number.stream().filter(x->x%2==0)//typically we pass data to a method but here we are passing a logic
//                .map(x->x*x)
//                .forEach(System.out::println);

        number.stream().filter(iseven)
                .map(square)
                .forEach(sysconsumer);



    }
}
