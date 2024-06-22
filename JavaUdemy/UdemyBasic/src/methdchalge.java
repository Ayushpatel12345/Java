public class methdchalge {
    public static void main(String[] args) {
        System.out.println("68in = " + convertToCentimeters(68)+"cm");

        System.out.println("5ft,8in = "+ convertToCentimeters(5,8)+"cm");
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int foot,int inches){
        return (foot * 12 + inches) * 2.54;
    }
}
