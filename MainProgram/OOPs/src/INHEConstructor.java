class Bird{
    Bird(){
        System.out.println("bird is fly");
    }
}
class Peacock extends Bird{

}
public class INHConstructor {
    public static void main(String[] args) {

        Peacock p1 = new Peacock();
    }
}
