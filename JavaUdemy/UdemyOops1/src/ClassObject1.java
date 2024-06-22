//class is below
public class ClassObject1
{
    private  String make = "tesla";
    private String model = "ts-xyz";
    private String color = "grey";
    private int doors = 2;
    private boolean convertible = true;


    public  void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));
    }
    
}
