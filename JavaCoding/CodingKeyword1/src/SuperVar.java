class Car{
    String color = "white";
}

class BMW extends Car{
    void print(){
        System.out.println(super.color);
    }
}

public class SuperVar {
    public static void main(String[] args) {

        BMW b1 = new BMW();
        b1.print();
    }
}
