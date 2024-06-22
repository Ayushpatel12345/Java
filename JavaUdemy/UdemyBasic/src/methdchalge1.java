public class methdchalge1 {
    public static void main(String[] args) {
      System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int seconds){
        int minutes = seconds/60; // min = 3945/60 : 65.75
        int hours = minutes/60;    // hour = 65.75/60
        System.out.println("hours = " + hours);

        int remainingMinutes = minutes%60;
        System.out.println("remainingminute = " + remainingMinutes);

        int remainingSeconds = seconds%60;
        System.out.println("remainingseconds = " + remainingSeconds);
        
        return  hours +"h " + remainingMinutes +"m " + remainingSeconds + "s ";
    }
}
