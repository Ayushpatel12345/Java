interface DemoAno{
    void meth1();
    void meth2();
}
public class Annotation1 {
    public static void main(String[] args) {

        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("method 1");
            }

            @Override
            public void meth2() {
                System.out.println("method 2");
            }
        };
        obj.meth1();
        obj.meth2(); 
    }
}
