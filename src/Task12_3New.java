import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Task12_3New {

    public static void main(String[] args) throws IOException {
        File file = new File("plik.txt");
        Scanner scan = new Scanner(file);
        TreeMap<Integer, Integer> numbers = new TreeMap<>();
        int keyTree;

        while (scan.hasNextLine()) {
            keyTree = scan.nextInt();
            if (numbers.containsKey(keyTree)) {
                numbers.put(keyTree, numbers.get(keyTree) + 1);
            } else {
                numbers.put(keyTree, 1);
            }
        }

        Set<Integer> keys = numbers.keySet();
        for (Integer key : keys) {
            System.out.println(key + " – liczba wystąpień: " + numbers.get(key));
        }

    }

}
