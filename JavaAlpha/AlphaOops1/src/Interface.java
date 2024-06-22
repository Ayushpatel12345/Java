public class Interface {
    public static void main(String[] args) {
        peacock p1 = new peacock();
        p1.walk();
    }
}
interface bird{
   void walk();
}
interface herbivore{
    
}
class peacock implements bird,herbivore {
    public void walk(){
        System.out.println("walk 2 legs");
    }
}

