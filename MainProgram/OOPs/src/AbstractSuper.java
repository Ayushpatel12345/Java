abstract class Animal0{
    public abstract void sound();

    Animal0(){
        System.out.println("all animals");
    }
}

class Tiger0 extends Animal0{

    Tiger0(){
        super();
    }
    public void sound(){
        System.out.println("growl sound");
    }
}

class Camel0 extends Animal0{

    Camel0(){
        super();
    }
    public void sound(){
        System.out.println("grunt sound");
    }
}
public class AbstractSuper {
    public static void main(String[] args) {

        Tiger0 t1 = new Tiger0();
        t1.sound();

        System.out.println();

        Camel0 c1 = new Camel0();
        c1.sound();

    }
}
