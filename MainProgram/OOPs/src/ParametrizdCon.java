class Stud{

    //parameterized constructor
    String name;
    int age;

    Stud(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class ParametrizdCon {
    public static void main(String[] args) {

        Stud s1 = new Stud("ayush",33);
        s1.print();

    }
}
