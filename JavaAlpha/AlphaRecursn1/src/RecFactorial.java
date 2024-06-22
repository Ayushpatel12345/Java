public class RecFactorial {
    public static int printFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * printFact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printFact(5));
    }
}
