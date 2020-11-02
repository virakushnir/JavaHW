import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.Sets;


public class HWSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("x");
        set1.add("y");
        set1.add("z");

        Set<String> set2 = new HashSet<String>();
        set2.add("x");
        set2.add("p");
        set2.add("q");

        Set<String> intersection = Sets.intersection(set1, set2);
        System.out.printf("Intersection of two Set %s and %s in Java is %s %n",
                set1.toString(), set2.toString(), intersection.toString());

        Set<String> union = Sets.union(set1, set2);
        System.out.printf("Union of two Set %s and %s in Java is %s %n",
                set1.toString(), set2.toString(), union.toString());
    }
}