interface Hotel{
    void cook();
}

interface Motel{
    void bill();
}

class Owner implements Hotel,Motel {
    @Override
    public void cook(){
        System.out.println("make cook");
    }
    @Override
    public void bill(){
        System.out.println("make bill");
    }
}

public class Interface {
    public static void main(String[] args) {

        Owner a1 = new Owner();
        a1.cook();
        a1.bill();
    }
}
