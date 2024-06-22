public class getter1ref {
    public static void main(String[] args) {

        getter1 car = new getter1();

        System.out.println("make: " + car.getMake());
        System.out.println("model: " + car.getModel());
        System.out.println("color: " + car.getColor());
        System.out.println("doors: " + car.getDoors());
        System.out.println("convertible: " + car.getConvertible());

    }
}
