class Emp{

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
public class MethdOvrloding {
    public static void main(String[] args) {

        Emp e1 = new Emp();
        e1.name = "raj";
        e1.age = 22;
        e1.printInfo(e1.name,e1.age);
    }
}
