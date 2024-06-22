public class constructor1 {
        private  String make;
        private String model;
        private String color;
        private int doors;
        private boolean convertible;

        // default constructor
//        public  constructor1(){
//            System.out.println("empty constructor call");
//        }
//
        //parameterized constructor
        public constructor1(String make,String model,String color,
                            int doors,boolean convertible){
            System.out.println("constructor with all parameter");
            this.make = make;
            this.model = model;
            this.color = color;
            this.doors = doors;
            this.convertible = convertible;
        }
        //change constructor value (make,model)
            public  constructor1(String customerColor,int custDoors,boolean convertible){
           this("kia","kia-123",customerColor,custDoors,convertible);
        }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean getConvertible() {
        return convertible;
    }
}
