package Streams;
import java.util.stream.Stream;
public class StreamEx18 {
    public static void main(String[] args) {
        Stream<Integer> stream= Stream.iterate(1, i -> i+2)
                .limit(10);

        stream.forEach(System.out:: println);
    }
}
