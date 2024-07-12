package Streams;

import java.util.ArrayList;
import java.util.List;
/*
i. Purely functional, so threadsafe
ii. Makes no commitment to an iteration path, so more parallelizable
iii. Declarative style – “what, not how”
iv. With Java 8 or later it is easy to transform into a parallel processing
solution
* */

public class StreamEx2 {
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
    final long count =  list.stream().filter(l -> l.length()>4).count();
    System.out.println("The fruit count greater than 4 is " +count);

}
}
