public class INHEworkr {
    private String  name;
    private String birthDate;
    protected String endDate;

    public INHEworkr(){

    }
    public INHEworkr(String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double coolectPay(){
        return  0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
