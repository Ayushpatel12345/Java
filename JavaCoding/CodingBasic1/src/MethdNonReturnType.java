public class MethdNonReturnType {

    /** non return-type(void) method **/

    //static method
    static void myMethod(){
        System.out.println("hello");
    }
    //non-static method
    void method(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        myMethod();                // static method

        MethdNonReturnType m1 = new MethdNonReturnType();  // non-static methods
        m1.method();
    }
}
