public class PayrollMain {
    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmp emp1 = new FullTimeEmp("ayush",101,14000.0);
        PartTimeEmp emp2 = new PartTimeEmp("raj",102,7,230);
        PartTimeEmp emp3 = new PartTimeEmp("jay",103,8,255);

        payrollSystem.addEmp(emp1);
        payrollSystem.addEmp(emp2);
        payrollSystem.addEmp(emp3);

        System.out.println("Initial Emp Details :- ");
        payrollSystem.displayEmp();

        System.out.println("\nRemoving Emp :- ");
        payrollSystem.removeEmp(101);

        System.out.println("\nAvailable Emp :- ");
        payrollSystem.displayEmp();

    }
}