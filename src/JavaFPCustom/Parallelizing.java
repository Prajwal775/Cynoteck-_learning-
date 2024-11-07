package JavaFPCustom;

import java.util.stream.LongStream;

public class Parallelizing {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        //LongStream.rangeClosed(1,100000000).sum();//92 milliseconds
        LongStream.rangeClosed(1,100000000).parallel().sum();//81 milliseconds

        System.out.println(System.currentTimeMillis()-time);


    }
}
