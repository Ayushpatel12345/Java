abstract class Animal{
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("dog is sound");
    }
}
class Lion extends Animal {
    @Override
    void sound(){
        System.out.println("lion is sound");
    }
}
public class Abstract {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.sound();

        Animal lion = new Lion();
        lion.sound();
    }
}
