package Streams;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream from an Array
public class StreamEx12 {
    public static void main(String[] args) {
        String[] stringArray= {"apple","banana","cheery"};
        Stream<String> stringStream = Arrays.stream(stringArray);
        List<String> list= stringStream.collect(Collectors.toList());

        System.out.println(list);
    }
}
