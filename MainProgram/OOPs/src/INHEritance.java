class Animal{
    public void run(){
        System.out.println("animal is run");
    }
}
class Dog extends Animal {

}

public class Inheritance throws {
    public static void main(String[] args) {

      Dog d1 = new Dog();
      d1.run();
    }
}
