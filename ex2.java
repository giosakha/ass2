package ass2;

import java.util.*;
/*Ex2) By using comparator, write a Java program to sort keys in Tree Map*/

public class ex2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        tree.put("banana", 10);
        tree.put("apple", 20);
        tree.put("cherry", 30);
        tree.put("date", 40);
        System.out.println("Sorted TreeMap: " + tree);
    }
}
