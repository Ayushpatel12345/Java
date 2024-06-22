import java.util.Scanner;

public class FunSum1 {

    public static int add(int a , int b ){
        return a+b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter no1 : ");
        int a = sc.nextInt();
        System.out.print("enter no2 : ");
        int b = sc.nextInt();

        System.out.println("sum of two number : " + add(a, b));
    }
}
