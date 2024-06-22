class Shape{
    void display(){
        System.out.println("Shape inside display");
    }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Rectangle inside area");
    }
}
class Cube extends Rectangle{
    void show(){
        System.out.println("Cube inside show");
    }
}
public class INHMultiLevel{
    public static void main(String[] args) {

        Cube c1 = new Cube();
        c1.show();
        c1.area();
        c1.display();
    }
}
