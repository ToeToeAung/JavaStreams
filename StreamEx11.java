package Streams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Stream from a collection using List.of
//using List of String to stream
//collect

public class StreamEx11 {
    public static void main(String[] args) {
       List<String> stringList=List.of("apple","banana","cherry");
       Stream<String> stream= stringList.stream();

       List<String> collectedList= stream.collect(Collectors.toList());

       System.out.println(collectedList);


    }
}
