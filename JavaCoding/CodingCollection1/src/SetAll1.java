import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetAll1 {
    public static void main(String[] args) {

        // HashSet
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(35);
        set1.add(10);
        set1.add(25);
        set1.add(55);
        set1.add(15);
        System.out.println("set           : " + set1);   // one time random value

        // LinkedHashset
        LinkedHashSet<Integer> lh1 = new LinkedHashSet<>();
        lh1.add(35);
        lh1.add(10);
        lh1.add(25);
        lh1.add(55);
        lh1.add(15);
        System.out.println("LinkedHashSet : " + lh1);  // ordered value

        // TreeSet
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(35);
        t1.add(10);
        t1.add(25);
        t1.add(55);
        t1.add(15);
        t1.add(15);
        System.out.println("TreeSet       : " + t1);
        
    }
}
