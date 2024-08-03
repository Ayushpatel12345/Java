class Shape{
   void area(){
        System.out.println("display area");
    }
}
class Rectangle extends Shape{
    @Override
    void area(int l,int w){
        System.out.println(l*w);
    }
}

public class InheritnceSingle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.area(10, 10);

    }
}
