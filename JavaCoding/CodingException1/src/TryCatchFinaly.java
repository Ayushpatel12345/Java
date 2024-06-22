public class TryCatchFinaly {
    public static void main(String[] args) {

      System.out.print("exception generate :- ");
        try{
            int a=5,b=0;
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally block executed\n");
        }

        System.out.print("exception not generate :- ");
        try{
            int a = 10,  b = 5;
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally block executed");
        }
    }
}
