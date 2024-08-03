import java.util.Arrays;

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("i am thread 1");
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("i am thread 2");
    }
}

public class ThradRunable {
    public static void main(String[] args) {

        MyThreadRunnable1 thread1 = new MyThreadRunnable1();
        Thread t1 = new Thread(thread1);
        t1.start();

        MyThreadRunnable2 thread2 = new MyThreadRunnable2();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}

