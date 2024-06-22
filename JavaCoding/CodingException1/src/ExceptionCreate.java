public class ExceptionCreate {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};
        try{
            System.out.println(arr[-1]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(arr[0]);
        }
    }
}
