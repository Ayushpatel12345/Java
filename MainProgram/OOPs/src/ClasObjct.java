class Employee1{

    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClasObjct{
    public static void main(String[] args) {

        Employee1 s1 = new Employee1();
        s1.name = "ayush";
        s1.age = 20;
        s1.printInfo();

    }
}
