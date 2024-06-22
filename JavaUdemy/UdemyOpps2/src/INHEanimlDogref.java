public class INHEanimlDogref {
    public static void main(String[] args) {

        INHEaniml animal = new INHEaniml("generic animal","huge",300);
        doAnimalStuff(animal," fast");


        INHEdog dog = new INHEdog();
        doAnimalStuff(dog," slow");
    }
    public  static  void doAnimalStuff(INHEaniml animal,String speed){
        animal.moves(speed);
        animal.noise();

        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
