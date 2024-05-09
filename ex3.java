package ass2;

import java.util.*;

/*Ex3) Create a random queue using java array. For example, the queued items are 44, 122, -4,
10,0,99. Now, by using only queue operations such as enqueue and
dequeue, do you think sorting is possible?
The output should be: -4, 0, 10, 44, 99, 122
Note: You could use another queue to copy the ordered elements
*/
public class ex3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(44);
        queue.add(122);
        queue.add(-4);
        queue.add(10);
        queue.add(0);
        queue.add(99);
        System.out.println("Original Queue: " + queue);
        Queue<Integer> sorted = sortQueue(queue);
        System.out.println("Sorted Queue: " + sorted);
    }
    public static Queue<Integer> sortQueue(Queue<Integer> queue) {
        Queue<Integer> sorted = new LinkedList<>();
        while (!queue.isEmpty()) {
            int min = queue.peek();
            for (int num : queue) {
                if (num < min) {
                    min = num;
                }
            }
            sorted.add(min);
            queue.remove(min);
        }
        return sorted;
    }
}
