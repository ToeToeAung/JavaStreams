package Streams;

import java.util.stream.Stream;
public class StreamEx19 {
    public static void main(String[] args) {
        Stream<Integer> integerStream= Stream.iterate(9, i -> i+2).limit(4);
        integerStream.forEach(System.out::println);
    }
}
