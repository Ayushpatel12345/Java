class Bank1{
    void getRateOfInterest(){
        System.out.println("interest of 0 percentage");
    }
}
//Creating child classes.
class SBI extends Bank1{
    @Override void getRateOfInterest(){
        System.out.println("sbi interest of 7 percentage");
    }
}

class BOB extends Bank1{
    @Override void getRateOfInterest(){
        System.out.println("bob interest of 8 percentage");
    }
}
public class OverRiding {
    public static void main(String[] args) {

        Bank1 ba = new BOB();
        ba.getRateOfInterest();

        SBI s1 = new SBI();
        s1.getRateOfInterest();

        BOB b1 = new BOB();
        b1.getRateOfInterest();
    }
}