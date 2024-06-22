public class Inheritance1 {
    public static void main(String[] args) {

    }
}

//single inheritance
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area1(int l,int h){
        System.out.println(0.5*l*h);
    }
}

//multilevel inheritance
class Shape1{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle1 extends Shape1{
    public void area(int l,int h){
        System.out.println(3.14*l*h);
    }
}
class equalityTriangle extends Triangle1{
    public void area(int l,int h){
        System.out.println(3.14*l*h);
    }
}