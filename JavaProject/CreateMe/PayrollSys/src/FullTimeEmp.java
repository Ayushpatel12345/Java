class FullTimeEmp extends Emp{

    private double monthlySalary;

    FullTimeEmp(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
