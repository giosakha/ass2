package ass2;
import java.util.*;
/*Ex 6) Given a linked list of integers, write a java program to reverse the linked list.*/
public class ex6 {
    private Integer value;
    private ex6 next;

    public ex6(Integer value) {
        this.value = value;
    }
    public ex6 addFirst(Integer value) {
        ex6 newhead = new ex6(value);
        newhead.next = this;
        return newhead;
    }
    public void printList() {
        ex6 current = this;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public ex6 reverse() {
        ex6 prev = null;
        ex6 current = this;
        while (current != null) {
            ex6 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ex6 list = new ex6(5);
        list = list.addFirst(4);
        list = list.addFirst(3);
        list = list.addFirst(2);
        list = list.addFirst(1);

        System.out.println("Original list:");
        list.printList();

        System.out.println("Reversed list:");
        ex6 reversed = list.reverse();
        reversed.printList();
    }
}