package ass2;
import java.util.*;
/*Ex5) Given a queue of integers of even length, shift the first half of the elements with the other
halves. Stack/Queue can be used as an auxiliary space.
Sample Input: [6, 5, 2, 3, 1, 3, 2, 1]
Output: [1, 3, 2, 1, 6, 5, 2, 3]
*/
public class ex5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println("Original Queue: " + queue);
        Queue<Integer> shifted = shiftQueue(queue);
        System.out.println("Shifted Queue: " + shifted);
    }
    public static Queue<Integer> shiftQueue(Queue<Integer> queue) {
        Queue<Integer> shifted = new LinkedList<>();
        Queue<Integer> first = new LinkedList<>();
        int size = queue.size();
        int half = size / 2;

        for (int i = 0; i < half; i++) {
            first.add(queue.poll());
        }

        for (int i = 0; i < half; i++) {
            shifted.add(queue.poll());
        }

        while (!first.isEmpty()) {
            shifted.add(first.poll());
            shifted.add(queue.poll());
        }

        return shifted;
    }
}