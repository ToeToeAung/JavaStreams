package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamEx9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Test1", "Test2", "Test3", "Test4", "Test5");
        System.out.println(list.stream().flatMap( x ->characterStream(x))
                .collect(Collectors.toUnmodifiableList()));


    }
    public static Stream<Character> characterStream(String s){
        char[] chars= s.toCharArray();
        Character[] charArray= new Character[s.length()];
        for(int i=0;i<s.length();i++){
            charArray[i] =chars[i];
        }

        return Stream.of(charArray);
    }

}
