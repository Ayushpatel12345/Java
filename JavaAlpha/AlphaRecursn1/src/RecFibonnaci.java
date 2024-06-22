import java.util.Scanner;

public class RecFibonnaci {

    public static long fib(long n){
        if ((n==0) || (n==1)){
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter no : ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
