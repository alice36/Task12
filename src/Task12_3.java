import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Task12_3 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("plik.txt"));
        TreeSet<Integer> treeSet =createTreeSet(lines);
        Iterator<Integer> iterator = treeSet.iterator();

        for (int i = 0; i < treeSet.size(); i++) {
            System.out.println(counter(lines,iterator.next()));
        }

    }

    private static TreeSet<Integer> createTreeSet(List<String> lines){
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < lines.size(); i++) {
            treeSet.add(Integer.valueOf(lines.get(i)));
        }
        return treeSet;
    }

    private static String counter(List<String> list, Integer nr) {
        Iterator<String> iterator = list.iterator();
        String counter;
        int count = 0;
        while (iterator.hasNext()) {
            Integer next = Integer.valueOf(iterator.next());
            if (next.compareTo(nr)==0) count++;
        }
        counter = nr + " - liczba wystapień " + count;
        return counter;
    }
}