package Streams;
import java.util.function.Function;
public class StreamEx10 {
    public static void main(String[] args) {
        Function<char[],String> myFunc= String :: new;
        char[] charArray = {'s','p','e','a','k','i','n','g','c','s'};

        System.out.println(myFunc.apply(charArray));
        System.out.println(new String(charArray));

    }
}