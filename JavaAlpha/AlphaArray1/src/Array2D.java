import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows : ");
        int rows = sc.nextInt();
        System.out.print("enter cols : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<cols ; j++){
                System.out.print( numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
