class Shape1{
    void display(){
        System.out.println("Shape inside display");
    }
}
class Rectangle1 extends Shape1{
    @Override
    void display(){
        System.out.println("Rectangle inside display");
    }
}
class Cube1 extends Rectangle1{
    @Override
    void display(){
        System.out.println("Cube inside display");
    }
}
public class INHEMultiLevl2 {
    public static void main(String[] args) {

        Cube1 c1 = new Cube1();
        c1.display();
    }
}