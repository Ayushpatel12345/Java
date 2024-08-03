import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {

        //numeric array sort
        int[] myArr1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456, 2121
        };
        System.out.println("Original array : " +Arrays.toString(myArr1));
        Arrays.sort(myArr1);
        System.out.println("Sorted array   : " + Arrays.toString(myArr1));

        System.out.println();

        //string array sort
        String[] arr1 = {
                "volvo",
                "ford",
                "kia",
                "ciaz",
                "bmw",
                "audi"
        };
        System.out.println("Original str : " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted str   : " + Arrays.toString(arr1));
    }
}