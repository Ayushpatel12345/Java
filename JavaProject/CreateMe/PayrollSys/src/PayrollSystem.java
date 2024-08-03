import java.util.ArrayList;
import java.util.List;

class PayrollSystem {
    private List<Emp> empList;

    public PayrollSystem(){
        empList = new ArrayList<>();
    }

    public void addEmp(Emp emp){
        empList.add(emp);
    }

    public void removeEmp(int id){
        Emp empToRemove = null;
        for (Emp emp : empList){
            if (emp.getId() == id){
                System.out.println(empToRemove = emp);
                break;
            }
        }
        if (empToRemove != null){
            empList.remove(empToRemove);
        }
    }

    public void displayEmp(){
        for (Emp emp : empList){
            System.out.println(emp);
        }
    }
}
