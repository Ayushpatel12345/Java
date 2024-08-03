class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {

        HelloThread ht = new HelloThread();
        ht.start();
    }
}
