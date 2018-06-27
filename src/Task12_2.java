import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task12_2 {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę: " + (i+1));
            numbers.add(input.nextInt());
        }

        System.out.println(formatSum(numbers));
    }

    private static String formatSum(Queue<Integer> queue) {
        int sum = 0, tmpInt;
        String format = "";
        while (!queue.isEmpty()) {
            tmpInt=queue.poll();
            format = format + tmpInt;
            if (!queue.isEmpty()) format = format + "+";
            sum = sum + tmpInt;
        }
        format = format + "=" + sum;
        return format;
    }
}
