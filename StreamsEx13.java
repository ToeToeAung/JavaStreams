package Streams;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class StreamsEx13 {
    public static void main(String[] args) {
        Stream<String> stringStream= Stream.of("apple","banana","cherry");
        List<String> collectedList= stringStream.collect(Collectors.toList());
        System.out.println(collectedList);

    }
}
