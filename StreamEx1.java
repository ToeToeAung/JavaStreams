package Streams;

import java.util.ArrayList;
import java.util.List;
/*Imperative-style solution
*i. Relies upon shared variable count, so is not threadsafe
ii. Commits to a particular sequence of steps for iteration
iii. Emphasis is on how to obtain the result, not what is needed*
*  */
public class StreamEx1 {
    public static void main(String[] args) {
        int count=0;
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        for(String word: list){
            if(word.length()>=3){
                count++;
            }
        }

        System.out.println("Fruit count " + count);
    }

}
