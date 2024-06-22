import java.util.Scanner;

public class userinput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int counter = 1;double sum = 0 ;

        do{
            System.out.println("enter number "+counter+" :");
            String nextLine = sc.nextLine();
            try{
                double number = Double.parseDouble(nextLine);
                counter++;
                sum += number;
            }catch (NumberFormatException abc){
                System.out.println("invalid number");
            }
        }while (counter <=5);
    System.out.println("sum of 5 numbers = " + sum);
    }
}
