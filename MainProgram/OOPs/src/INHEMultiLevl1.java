class Shape1{
    void display(){
        System.out.println("Shape inside display");
    }
}
class Rectangle1 extends Shape1{
    void see(){
        System.out.println("Rectangle inside see");
    }
}
class Cube1 extends Rectangle1{
    void show(){
        System.out.println("Cube inside show");
    }
}
public class INHMultiLevel throws ClassNotFoundException{
    public static void main(String[] args) {

        Cube1 c1 = new Cube1();
        c1.show();
        c1.see();
        c1.display();
    }
}
