public class setter1ref {
    public static void main(String[] args) {

        setter1 car = new setter1();

        //settter(set method is used to set the value)
        car.setMake("audi"); // "tesla" = "audi" set value
        System.out.println("make: " + car.getMake()); //print statment

        car.setModel("audi-xy");
        System.out.println("model: " + car.getModel());

        car.setColor("red");
        System.out.println("color: " + car.getColor());

        car.setDoors(3);
        System.out.println("doors: " + car.getDoors());

        car.setConvertible(false);
        System.out.println("convertible: " + car.getConvertible());

    }
}
