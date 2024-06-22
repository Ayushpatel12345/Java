class MyThread1 extends Thread{
   @Override
   public void run(){
       int i=0;
        while (i<500){
            System.out.println("cooking me");
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<500){
            System.out.println("dancing me");
            System.out.println("i am sad");
            i++;
        }
    }
}
public class ThradCreate {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }

}
