public class INHEemp extends INHEworkr {
    private long employeeId;
    private String hireDate;

    private static int employeno =  1;
    public INHEemp(String name, String birthDate,String hireDate) {
        super(name, birthDate);
        this.employeeId = INHEemp.employeno++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
