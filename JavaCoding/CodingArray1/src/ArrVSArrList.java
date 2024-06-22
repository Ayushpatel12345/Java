import java.util.ArrayList;

public class ArrVSArrList {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 15;
        arr[1] = 25;
        arr[2] = 35;
        System.out.println("Array Length : " + arr.length);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Arraylist Size : " + list.size());
    }
}
