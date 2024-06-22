public class sumdigit {
    public static void main(String[] args) {

        System.out.println("sum of digit 1234 is:"+sumOfDigit(1234));
        System.out.println("sum of digit 1234 is:"+sumOfDigit(5));
    }
    public  static int sumOfDigit(int n){
        if(n<0){
            return -1;
        }
       int sum = 0,digit;

        while (n > 0){
            digit = n%10;
            sum = sum+digit;
            n = n/10;
        }
        return sum;
    }
}
