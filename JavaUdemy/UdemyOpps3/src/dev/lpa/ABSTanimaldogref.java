package dev.lpa;

public class ABSTanimaldogref {
    public static void main(String[] args) {

//        ABSTanimal abstract class does not use below
//        ABSTanimal animal = new ABSTanimal("animal","big",100);
        ABSTdog dog = new ABSTdog(" smallanimal"," small",400);
        dog.makeNoise();
        doAnimalStuff(dog);
    }
    private static void doAnimalStuff(ABSTanimal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
