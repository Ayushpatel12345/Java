import java.util.Arrays;

public class Arr2dPrint {
    public static void main(String[] args) {

        int[][] arr = {
                            {10,20,30,40},
                            {15,25,35,45}
                      };

        System.out.println("print 2D array : ");
        for (int row=0 ; row<=1 ; row++ ){
            for (int col=0 ; col<=3 ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArrays deepToString : " + Arrays.deepToString(arr));


    }
}
