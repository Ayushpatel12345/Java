abstract class Bank{
    abstract void readData();
}

class Admin extends Bank{

    @Override
    void readData() {
        System.out.println("admin read data");
    }
}

class Marketing extends Bank{

    @Override
    void readData() {
        System.out.println("marketing read data");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Admin a1 = new Admin();
        a1.readData();

        Marketing m1 = new Marketing();
        m1.readData();
    }
}
