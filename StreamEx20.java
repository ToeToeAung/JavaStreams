package Streams;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class StreamEx20 {
    public static void main(String[] args) {
        //Static Method Reference
        //Instance Method  Reference
        //Constructor Method
        List<String> nameList= Arrays.asList("Alice","Bob","Charlie","Dan","Eve","Fred","George");
        Stream<String> nameStream= nameList.stream()
                .map(String:: toLowerCase);
        nameStream.forEach(System.out:: println);

    }
}
