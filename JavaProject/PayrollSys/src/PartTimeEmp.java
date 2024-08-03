class PartTimeEmp extends  Emp{

    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmp(String name,int id,int hoursWorked,double hourlyRate){
        super(name,id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
