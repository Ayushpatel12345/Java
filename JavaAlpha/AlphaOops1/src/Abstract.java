abstract class Animal{
    public abstract void walk();

}
class Horse extends Animal{
    public void walk(){
        System.out.println("horse walk 4 leg");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("chicken walk 2 leg");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
