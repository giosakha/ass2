package ass2;

import java.util.*;
/*Ex1) Create a tree set with random numbers and find all the numbers which are less than 100 and
greater than 50*/
public class ex1 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            tree.add((int) (Math.random() * 200));
        }
        System.out.println("Original TreeSet: " + tree);
        TreeSet<Integer> filteredSet = new TreeSet<>();
        for (int num : tree) {
            if (num > 50 && num < 100) {
                filteredSet.add(num);
            }
        }
        System.out.println("Numbers between 50 and 100: " + filteredSet);
    }
}
