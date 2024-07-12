package Streams;

import java.util.Arrays;
import java.util.Random;

public class StreamEx4 {

    public static void main(String[] args) {
        int[] array= new Random().ints(1_000_000,1,100).toArray();
        int sum= Arrays.stream(array).parallel().sum();

        System.out.println("Parallel sum value is " + sum);
    }
}
