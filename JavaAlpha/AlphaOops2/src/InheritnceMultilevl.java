class Shape1{
    public void area(){
        System.out.println("display area");
    }
}
class Rectangle1 extends Shape1{
    public void area(int l,int w){
        System.out.println(l*w);
    }
}
class Triangle1 extends Rectangle1{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

public class InheritnceMultilevl {
    public static void main(String[] args) {

    }
}