abstract class ANimal{
    abstract void sound();

}

class Tiger extends ANimal{

    @Override
    void sound(){
        System.out.println("growl sound");
    }
}

class Camel extends ANimal{

    @Override
    void sound(){
        System.out.println("grunt sound");
    }
}
public class Abstract {
    public static void main(String[] args) {

        Tiger t1 = new Tiger();
        t1.sound();

        Camel c1 = new Camel();
        c1.sound();

    }
}
