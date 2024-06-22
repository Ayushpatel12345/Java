public class ClassObject1  {
    public static void main(String[] args) {

        pen pen1 = new pen();
        pen1.color = "red";
        pen1.type  = "bluepoint";
        pen1.print();

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "blackpoint";
        pen2.print();
    }
}
class pen{
    String color;
    String type;

    public void print(){
        System.out.println(this.color);
    }
}

