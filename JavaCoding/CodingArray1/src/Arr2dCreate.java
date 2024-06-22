public class Arr2dCreate {
    public static void main(String[] args) {

        //1st method
        int[][] myArr = {{1,2},{3,4}};
        System.out.println("1stMethod : " + myArr[0][0]);
        System.out.println("1stMethod : " + myArr[1][1]);

        //2nd method
        int[][] myArr1 = new int[2][2];
        myArr1[0][0] = 1;
        myArr1[0][1] = 2 ;
        myArr1[1][0] = 3;
        myArr1[1][1] = 4;
        System.out.println("\n2ndMethod : " + myArr1[0][1]);
        System.out.println("2ndMethod : " + myArr1[1][0]);
    }
}
