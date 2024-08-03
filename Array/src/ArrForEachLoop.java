import java.util.Arrays;

public class ArrForEachLoop {
    public static void main(String[] args) {


        int[] myArr = {10,20,30,40};

        System.out.print("for each loop :  ");
        for (int value : myArr){
            System.out.print(value + " ");
        }

        System.out.print("\n\nfor loop : ");
        for (int i=0 ; i<myArr.length ; i++){
            System.out.print(myArr[i] + " ");
        }

        System.out.print("\n\nArray toString : " + Arrays.toString(myArr));

    }
}
