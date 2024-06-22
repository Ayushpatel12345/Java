public class POLYcar {
    private String description;

    public POLYcar(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("car -> startEngine");
    }
    protected void runEngine(){
        System.out.println("car -> runengine");
    }
    public void drive(){
        System.out.println("car -> driving,type is " + getClass().getSimpleName());
        runEngine();
    }
}
class GasPoweredCar extends POLYcar{
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("gas -> all %d cylinders are fired up,ready%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("gas -> usage excedes the average: %.2f %n" , avgKmPerLiter);
    }
}