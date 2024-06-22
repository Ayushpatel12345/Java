public class PolyFunOverloding{
    public static void main(String[] args) {

        poly p1 = new poly();
        p1.name = "raj";
        p1.age = 22;
        p1.printInfo(p1.name);
        p1.printInfo(p1.age);
        p1.printInfo( p1.name, p1.age);

        System.out.println();

        poly p2 = new poly();
        p2.name = "jay";
        p2.age = 30;
        p2.printInfo(p2.name);
        p2.printInfo(p2.age);
        p2.printInfo(p2.name,p2.age);
    }
}
class poly{
    String name;
    int age;
    public void printInfo(String name){
         System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }
}
