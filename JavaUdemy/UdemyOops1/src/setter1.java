public class setter1 {
        private  String make = "tesla";
        private String model = "tesla-xyz";
        private String color = "grey";
        private int doors = 2;
        private boolean convertible = true;
        public String getMake(){return make;}
        public void setMake(String make){
        this.make = make;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public int getDoors() {
                return doors;
        }

        public void setDoors(int doors) {
                this.doors = doors;
        }

        public boolean getConvertible() {
                return convertible;
        }

        public void setConvertible(boolean convertible) {
                this.convertible = convertible;
        }
}



