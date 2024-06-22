package dev.lpa;
public class ABSTdog extends ABSTanimal{

    public ABSTdog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(type + " walking");
        }else{
            System.out.println(type + " running");
        }
    }
    @Override
    public void makeNoise() {
        if (type == "wolf"){
            System.out.print(" hello");
        }else {
            System.out.printf(" world");
        }
    }
}