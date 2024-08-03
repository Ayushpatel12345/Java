public class CarMain {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("c01", "Toyota", "Camry", 60.0); // Different base price per day for each car
        Car car2 = new Car("c02", "Honda", "Accord", 70.0);
        Car car3 = new Car("c03", "Mahindra", "Thar", 150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}
