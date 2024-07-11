package random_sort;

import java.security.SecureRandom;
import java.util.*;

public class RandomSort {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("mango", "apple", "pineapple", "cherry", "dragonfruit");

        randomSort(fruits);
        System.out.println(fruits);
    }

    private static void randomSort(List<String> fruits) {
        Random random = new SecureRandom();
        int seed = random.nextInt();

        fruits.sort(Comparator.comparingInt(s -> hash(s, seed)));
    }

    private static int hash(String s, int seed) {
        // ^ XOR operator return true if only one value is true
        return s.hashCode() ^ seed;
    }
}
