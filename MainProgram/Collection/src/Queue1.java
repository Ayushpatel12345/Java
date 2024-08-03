import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

//      queue offer(add);
//      queue poll(remove);

        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(20);
        q1.offer(15);
        q1.offer(30);
        q1.offer(10);
        System.out.println("Queue list         : " + q1);
        System.out.println("Queue poll(remove) : " + q1.poll());
        System.out.println("Queue list         : " + q1);
    }
}
