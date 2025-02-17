package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx7 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(3,5,2,3,8);
        List<int[]> intArrs = ints.stream()
                .map(int[]::new)
                .collect(Collectors.toList());

        List<String> intArrsStr = intArrs.stream()
                .map(Arrays :: toString)
                .collect(Collectors.toList());

        System.out.println(intArrsStr);


    }
}
