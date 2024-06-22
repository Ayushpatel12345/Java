public class constructrall{
    private String name;
    private  double creditLimit;
    private String email;

    //three parameter
    public constructrall(String name,double creditLimit,String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //two parameter(one bydefault value = creditlimit)
    public constructrall(String name, String email) {
        this(name,2000,email);
    }

    //zero parameter(three bydefault value = name,creditlimit,email)
    public constructrall(){
        this("def",5000,"def@gmail.com");
    }


    public String getName(){return name;}
    public double getCreditLimit(){return creditLimit;}
    public String getEmail(){return email;}
}
