public class ArrIdxBound {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        try{
            System.out.println(arr[-1]);
        }catch (Exception e){
            System.out.println("wrong answer " + e);
        }
    }
}
