public class ErrType {
    public static void main(String[] args) {

    //syntax err
        //int a=20;
        //System.out.println(a)

    //logical err
      int n=10;
       if (n%2 == 0){
          System.out.println("no is odd");
       }else {
          System.out.println("no is even");
       }

    //runtime err
        int a=5,b=0;
        System.out.println(a/b);

    }
}
