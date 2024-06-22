class Person{
    int rollno;
    String name;
    int salary;

    Person(int rollno,String name,int salary){
        this.rollno = rollno;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + salary);
    }
}

public class ThisVar {
    public static void main(String[] args) {

        Person p1 = new Person(1,"ayush",50000);
        p1.display();
        Person p2 = new Person(2,"raj",45000);
        p2.display();
    }
}
