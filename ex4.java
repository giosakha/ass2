package ass2;
import java.util.*;
/*Ex4) Given a list of numbers, cube them and filter the numbers which are greater 500 and then
find average of them (use Arrow function)*/
public class ex4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        List<Double> cubed = new ArrayList<>();
        for (int number : numbers) {
            double cube = Math.pow(number, 3);
            if (cube > 500) {
                cubed.add(cube);
            }
        }

        double sum = 0;
        for (double number : cubed) {
            sum += number;
        }

        double average = sum / cubed.size();
        System.out.println("Average: " + average);
    }
}
