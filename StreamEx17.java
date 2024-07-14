package Streams;

import java.util.stream.Stream;

public class StreamEx17 {
    public static void main(String[] args) {
        Stream<Integer> stream1= Stream.iterate(1, i->i+1)
                        .limit(10);
        stream1.forEach(System.out::println);
    }
}
