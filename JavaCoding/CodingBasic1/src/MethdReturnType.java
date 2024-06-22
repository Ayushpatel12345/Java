public class MethdReturnType {

    /** return-type(int) method **/

    //static method
    static int myMethd(){
        System.out.println("world");
        return 0;
    }
    //non-static method
    int methd(){
        System.out.println("world");
        return 0;
    }

    public static void main(String[] args) {
       myMethd();      //static method

       MethdReturnType m1 = new MethdReturnType();  //non-static method
       m1.methd();

    }
}
