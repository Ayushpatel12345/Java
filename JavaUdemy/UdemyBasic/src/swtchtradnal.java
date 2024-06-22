public class swtchtradnal  {
    public static void main(String[] args) {

        String month= "nov";
        System.out.println(month + " is " + getQuarter(month) + " quarter");
    }
    public static String  getQuarter(String month){
        switch (month){
            case "jan":
            case "feb":
            case "mar":
                return "1st";
            case "apr":
            case "may":
            case "jun":
                return "2nd";
            case "jul":
            case "aug":
            case "sep":
                return  "3rd";
            case "oct":
            case "nov":
            case "dec":
                return "4th";
        }
        return  "no month";
    }
}


