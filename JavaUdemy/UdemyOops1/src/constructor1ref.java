public class constructor1ref {
    public static void main(String[] args) {

//        //  default constructor
//       constructor1 con = new constructor1();
//
//        //  parameterized constructor
//        constructor1 car = new constructor1("bmw","bmw-xy",
//                "brown",2,false);
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getColor());
//        System.out.println(car.getDoors());
//        System.out.println(car.getConvertible());

        //change constructor
        constructor1 car01  = new constructor1("red",3,false);
        System.out.println("make:" + car01.getMake() + " , model:"+car01.getModel()
                + " , color:"+ car01.getColor() );

    }
}
