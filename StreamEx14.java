package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx14 {
 //   List<String> stringList=List.of("banana","apple","orange");
 //   Stream<String> stringStream=stringList.stream();
   // String[] vals= stringStream.toArray(); compiler error
     // String[] vals= stringList.toArray(String[] :: new);
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Eleven","strikes","the","clock");
        String[] stringArr2 = strings.stream().toArray(String[] ::new);
        System.out.println(Arrays.toString(stringArr2));
    }
}
