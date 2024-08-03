import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);    // 0 index
        list.add(20);    // 1 index
        list.add(30);
        System.out.println("print element : " + list.get(1));   // print element

        list.add(40);                                           // add element
        System.out.println("add element : " + list);

        list.remove(1);                                   //remove element
        System.out.println("remove element : " + list);

        list.set(0,14);                                         // update element
        System.out.println("update element : " + list);

        // multi-dimensional arraylist
       ArrayList<ArrayList<Integer>>  lst = new ArrayList<ArrayList<Integer>>();
       lst.add(list);
       lst.add(list);
       System.out.println("Multi Dimensional Arraylist : " + lst);

    }
}
