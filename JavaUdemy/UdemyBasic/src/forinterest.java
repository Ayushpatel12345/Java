public class forinterest {
  public static void main(String[] args) {
		for(double rate = 1.0; rate <= 4.0 ; rate++){
        double interestAmount = calculateInterest(12000,rate);
        System.out.println("10,000 "+ rate + "% interest =" + interestAmount);
        }
    }
    public static double calculateInterest(double amount,double Interestrate){
    	return (amount * Interestrate/100);
    }
}
