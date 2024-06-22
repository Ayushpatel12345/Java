public class Inheritance {
    public static void main(String[] args) {

    }
}
//hirachical inheritance
class Shape2{
    public void area(){
        System.out.println("displaying area");
    }
}
class Triangle2 extends Shape2{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
class Circle extends Shape2{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}