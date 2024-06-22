public class whileeven {
    public static void main(String[] args){

        int number = 4;
        int finishNumber = 20;
        int oddCount=0;
        int evenCount=0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("even number " + number);
            evenCount++;
        }
        System.out.println("total odd number " + oddCount);
        System.out.println("total even number " + evenCount);
    }
    public static boolean isEvenNumber(int number){

        if((number % 2) == 0){
            return  true;
        }else {
            return false;
        }
    }

}
