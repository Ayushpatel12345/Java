public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("implicit");
        int i = 12;
        float f = i;
        double d = f;
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);

        System.out.println("\nexplicit");
        double d1 = 1234567.35d;
        float f1 = (float)d1;
        int i1 = (int)f1;
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(i1);

    }
}
