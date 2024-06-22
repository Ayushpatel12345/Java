import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        /* ------ push(add) ------ */
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println("push : " + s1);    // add value

        /* ----- pop(remove) ----- */
        Stack<Integer> s2 = new Stack<>();
        s2.push(40);
        s2.push(20);
        s2.push(50);
        s2.push(15);
        s2.push(35);
        System.out.println("\npop list : " + s2);

        s2.pop();
        System.out.println("pop      : " + s2);         // last value remove

        /* ----- peek(last) ----- */
        Stack<Integer> s3 = new Stack<>();
        s3.push(20);
        s3.push(15);
        s3.push(50);
        s3.push(10);
        s3.push(25);
        System.out.println("\npeek list : " + s3);

        System.out.println("peek      : " + s3.peek());   // last value return




    }
}
