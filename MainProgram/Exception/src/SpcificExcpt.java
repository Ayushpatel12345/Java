public class SpcificExcpt {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;
        int a=5,b=0;

        try {
            System.out.println(arr[5]);
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
