//constructor ne print karava mate constructor niche method banavi
// method ma constructor print karvu.
public class Constructor2 {
    public static void main(String[] args) {

        copy emp1 = new copy();
        emp1.name = "vishv";
        emp1.age = 25;

        copy emp2 = new copy(emp1);
        emp2.printInfo();
    }
}
class copy {
    String name;
    int age;

    copy(copy emp2){
        this.name = emp2.name;
        this.age = emp2.age;
    }
    copy(){

    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
