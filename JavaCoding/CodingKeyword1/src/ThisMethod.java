class Animal{
    void a(){
        System.out.println("a is method");
    }
    void b(){
       this.a();
    }
}
public class ThisMethod {
    public static void main(String[] args) {

        Animal ani = new Animal();
        ani.b();
    }
}
