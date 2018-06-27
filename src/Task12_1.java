import java.util.*;

public class Task12_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            treeSet.add(rand.nextInt(1000));
        }

        System.out.println("Najmniejsza z liczb to " + treeSet.first());
        System.out.println("Największa z liczb to " + treeSet.last());
        System.out.println("Srednia liczb to " + average(treeSet));
        System.out.println("Liczby większe od średniej to ");
        greaterThanAverage(treeSet, average(treeSet));
    }

    private static double average(TreeSet<Integer> set){
        double sum = 0;
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            sum = sum + iterator.next();
        }
        return sum/set.size();
    }

    private static void greaterThanAverage(TreeSet<Integer> set, double avg){
        Iterator<Integer> iterator = set.iterator();
        TreeSet<Integer> setGreater = new TreeSet<>();
        int tmpNr;

        while(iterator.hasNext()) {
            tmpNr = iterator.next();
            if (tmpNr>avg) setGreater.add(tmpNr);
        }

        System.out.println(setGreater);
    }
}
