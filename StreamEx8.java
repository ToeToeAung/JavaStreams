package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Joe","Tom","Abe");
        System.out.println("List *** " + list.stream()
                .flatMap(x -> characterStream(x))
                .collect(Collectors.toList()));
    }

    public static Stream<Character> characterStream(String s){
        char[] chars = s.toCharArray();
        Character[] charArr = new Character[s.length()];

        for(int i=0;i<s.length();i++){
            charArr[i] = chars[i];
        }
        return Stream.of(charArr);
    }

}

