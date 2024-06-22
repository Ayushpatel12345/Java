
public class ClassObject2 {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.name = "ayush";
        s1.age = 20;
        s1.printInfo();

        System.out.println();

        Stud s2 = new Stud();
        s2.name = "jay";
        s2.age = 22;
        s2.printInfo();

    }
}
class Stud{
    String name;
    int age;

    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
}