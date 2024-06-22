public class ArrBasic {
    public static void main(String[] args) {

        //1st method
        int[] myMarks = {10,20,30,40,50};
        System.out.println("myMarks = " + myMarks[2]);
        System.out.println("myMarks = " + myMarks[4] );
        System.out.println();


        //2nd method
        int[] myArray = new int[4];
        myArray[0] = 5;
        myArray[1] = 15;
        myArray[2] = 25;
        myArray[3] = 35;

        for (int i=0; i<4 ;i++){
            System.out.println("myArray = " + myArray[i]);
        }

    }
}
