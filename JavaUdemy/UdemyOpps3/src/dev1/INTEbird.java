package dev1;

public class INTEbird extends INTEanimal implements flightEnabled,trackable{
    public void move(){
        System.out.println("flags wings");
    }

    @Override
    public void takeoff() {
        System.out.printf(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " 's coordinates recorded");
    }

    @Override
    public void track() {

    }
}
