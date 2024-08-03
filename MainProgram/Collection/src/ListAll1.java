import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListAll1 {
    public static void main(String[] args) {

        // List
        List<Integer> list = new ArrayList<>();
        list.add(0,10);
        list.add(20);                // second index
        list.add(1,30);
        System.out.println("List : " + list);

        // ArrayList
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(0,15);
        lst.add(25);
        lst.add(1,35);
        System.out.println("ArrayList : " + lst);

        // LinkedList
        LinkedList<Integer> lst1 = new LinkedList<>();
        lst1.add(0,12);
        lst1.add(24);
        lst1.add(1,36);
        System.out.println("Linked List : " + lst1);

        // vector
        Vector<Integer> vect = new Vector<>();
        vect.add(0,75);
        vect.add(65);
        vect.add(1,55);
        vect.clear();
        System.out.println("Vector : " + vect);
    }
}
