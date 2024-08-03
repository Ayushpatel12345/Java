abstract class Emp{

    private String name;
    private int id;

    Emp(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    abstract double calculateSalary();

    @Override
    public String toString() {
        return "Emp[name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}
