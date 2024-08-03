import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(10);
        numbers.add(18);
        numbers.add(12);
        numbers.forEach( (no) -> {System.out.println(no);} );
    }
}