public class MultiCatch {
    public static void main(String[] args) {

        // 1st Exception
        int[] arr = {1,2};
        try{
            System.out.println(arr[3]);
        }catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println("1st Exception : " + e);
        }

        // 2nd Exception
        try{
            int a=5 , b=0 ;
            System.out.println(a/b);
        }catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println("2nd Exception : " + e);
        }


    }
}
