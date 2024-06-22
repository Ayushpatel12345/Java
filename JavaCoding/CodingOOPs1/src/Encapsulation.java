class Emp{

    int id;
    String name;
    private int salary;

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
public class Encapsulation {
    public static void main(String[] args) {

        Emp e1 = new Emp();
        e1.setSalary(50000);
        System.out.println(e1.getSalary());

    }
}
