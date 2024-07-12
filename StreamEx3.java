package Streams;

import java.util.ArrayList;
import java.util.List;
/*Parallel-processing solution*/
public class StreamEx3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Pear");
        list.add("Grape");
        list.add("Pineapple");
        list.add("Watermelon");
        list.add("Lemon");
        list.add("Lime");
        list.add("Mango");
        list.add("Grapefruit");
        final long count = list.parallelStream().filter(l->l.length()>5).count();

        System.out.println("The fruit count greater than 5 is " +count);

    }
}
