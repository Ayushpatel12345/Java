//constructor ne print karava mate constructor niche method banavi
// method ma constructor print karvu.
public class Constructor1 {
    public static void main(String[] args) {
        //default constructor
        Student defalt = new Student();

        //parameterize constructor
        Student para = new Student("ayush",18);
        para.printInfo();
    }
}
class Student {
    String name;
    int age;

//    default constructor
    Student() {
        System.out.println("default constructor called");
    }

    //prameterized constructor
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
