package Streams.StreamEx16;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
      Function<Account,Integer> byBalance = a -> a.getBalance();
      Function<Account,String> byName = a -> a.getOwnerName();
       // Collections.sort(accounts, Comparator.comparing(byBalance));
    }
}
