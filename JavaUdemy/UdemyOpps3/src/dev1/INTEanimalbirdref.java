package dev1;

public class INTEanimalbirdref {
    public static void main(String[] args) {
        INTEbird bird = new INTEbird();
        INTEanimal animal = bird;
        flightEnabled flier = bird;
        trackable tracked = bird;

        animal.move();

        flier.takeoff();
        flier.fly();
        tracked.track();
        flier.land();
    } 
}
