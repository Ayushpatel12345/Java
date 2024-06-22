interface Car{
     int tier = 4;
     void color();
}
interface MotorCyclic{

}
class Volvo implements Car,MotorCyclic{
    public void color(){
        System.out.println("volvo is white");
    }
}

public class Interface {
    public static void main(String[] args) {

        Volvo v1 = new Volvo();
        v1.color();

    }
}
