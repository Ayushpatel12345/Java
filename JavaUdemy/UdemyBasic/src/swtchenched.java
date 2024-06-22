public class swtchenched {
    public static void main(String[] args) {
        printDayOfWeek(8);
    }
    public  static  void printDayOfWeek(int day){
     String dayOfWeek = switch (day){
          case 0 -> "sun";
          case 1 -> "mon";
          case 2 -> "tue";
          case 3 -> "wed";
          case 4 -> "thu";
          case 5 -> "fri";
          case 6 -> "sat";
          default -> "no day";
      };
      System.out.println(day +" stands for " + dayOfWeek);
    }
}
