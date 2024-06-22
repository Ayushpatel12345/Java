import java.util.Scanner;

public class FunFactorial1 {

    public static void printFactorial(int n){
        int fact = 1;
        for (int i = 1 ; i <=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
