abstract class Animal{
    abstract void eat();
    public void taste(){
        System.out.println("Animal taste");
    }
}
class Lion extends Animal{
    @Override
    public void eat() {}
}

public class Temp1 {
    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.taste();
    }
}
