class Fish{
    void display(){
        System.out.println("fish is blue");
    }
}
class Shark extends Fish{
    void show(){
        super.display();
    }
}
public class SuperMethod {
    public static void main(String[] args) {

        Shark s1 = new Shark();
        s1.show();
    }
}
