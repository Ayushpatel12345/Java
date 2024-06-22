class Student{

    //parameterized constructor
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void printInfo(){
        System.out.println(id+" "+name);
    }
}
public class ConPara {
    public static void main(String[] args) {

        Student s1 = new Student(1,"raj");
        s1.printInfo();
    }
}
