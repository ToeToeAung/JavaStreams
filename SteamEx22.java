package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.List;
public class SteamEx22 {
public static void main(String[] args) {
    List<String> words= Arrays.asList("Mu","San San Htun Aung","Bob","Aye Aye Aung","Alice","SuSu","Moe Moe");
    Function<String,Integer> byLength = s -> s.length();
    Stream<String> longestFirst=words.stream()
            .sorted(Comparator.comparing(byLength).reversed());

            longestFirst.forEach(System.out::println);
}
}
