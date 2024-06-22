public class POLYcarref {
    public static void main(String[] args) {

        POLYcar car = new POLYcar("ferrari is 296 gts");
        runRace(car);

        System.out.printf("\n");
        
        POLYcar ferrari = new GasPoweredCar("ferrari is 296 gts",15.4,
                6);
        runRace(ferrari);
       }
    public static void runRace(POLYcar car){
        car.startEngine();
        car.drive();
    }
}
