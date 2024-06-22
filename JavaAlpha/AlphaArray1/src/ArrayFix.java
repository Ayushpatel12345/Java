public class ArrayFix {
    public static void main(String[] args) {

        //first method
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 67;
        marks[2] = 76;

        for (int i = 0 ; i < 3 ; i++){
            System.out.println(marks[i]);
        }
        System.out.println();
        //second method
        int[] number = {11,22,33};
        for (int i = 0 ; i < 3 ; i++){
            System.out.println(number[i]);
        }
    }
}
