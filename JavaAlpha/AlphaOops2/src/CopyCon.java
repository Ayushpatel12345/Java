class Studn{

    //copy constructor
    String name;
    int age;

    Studn(Studn s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Studn(){

    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class CopyCon {
    public static void main(String[] args) {

        Studn s1 = new Studn();
        s1.name = "janak";
        s1.age = 22;

        Studn s2 = new Studn(s1);
        s2.print();
    }
}
