// multiple inheritance does not support java
// multiple inheritance support interface in java

interface A{
    void run();
}
interface B {
    void eat();
}
class C implements A,B{

    @Override
    public void run(){
        System.out.println("run method");
    }

    @Override
    public void eat() {
        System.out.println("eat method");
    }
}
public class INHMultiple {
    public static void main(String[] args) {

        C c1 = new C();
        c1.run();
        c1.eat();
    }
}
