class Employee{

    String name;
    static String school;

    static void changeSchool(){
        school = "newSchool";
    }
}
public class StaticKeyword {
    public static void main(String[] args) {

        Employee.school = "SDJ";
        System.out.println(Employee.school);
    }
}
