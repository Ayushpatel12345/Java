public class SwitchTernary {
    public static void main(String[] args) {

        char grade = 'd';
        switch (grade) {
            case 'a' -> System.out.println("excellent");
            case 'b' -> System.out.println("good");
            case 'c' -> System.out.println("medium");
            case 'd' -> System.out.println("bad");
            default -> System.out.println("fail");
        }


        int n = 3;
        String s  = (n%2 == 0) ? "even" : "odd";
        System.out.println("\n"+s);
    }
}
