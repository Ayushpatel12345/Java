class Tree{
    Tree(){
        System.out.println("tree class constructor");
    }
}
class Coconut extends Tree{
    Coconut(){
        super();
    }
}
public class SuperCon {
    public static void main(String[] args) {

        Coconut c1 = new Coconut();
    }
}
