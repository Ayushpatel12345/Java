import java.util.*;
public class ScannerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18)
            System.out.println("you can vote");
        else
            System.out.println("you can not vote");
    }
}