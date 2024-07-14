package Streams;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamEx21 {
    public static void main(String[] args) {
        //InstanceMethod Reference of a Particular Object
        List<String> nameList=Arrays.asList("Alice","Bob","Charlie","Dan","Eve","Fred","George");
        Stream<String> nameStream=nameList.stream();
        //nameStream.forEach(System.out:: println);

        //Instance Method Reference of an Arbitrary Object of a Particular Type

        //Constructor Reference
        List<Person> personList= nameList.stream()
                .map(Person::new)
                .collect(Collectors.toList());
        personList.forEach(System.out :: println);


    }
}
