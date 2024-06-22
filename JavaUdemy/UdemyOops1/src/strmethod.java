public class strmethod {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("11");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("birth year = " + birthDate.substring(startingIndex));

        System.out.println("month = " + birthDate.substring(3,6)); //substring last(6) not count
        System.out.printf("\n");

        String newDate = String.join("/","25","11","1982");
        System.out.println("newdate = " + newDate);
        System.out.printf("\n");

        String newDate1 = "25" + "/" + "08" + "/" + "1992";
        System.out.println("newdate1 = " + newDate1);
        System.out.println(newDate1.replace("/","-"));
        System.out.printf("\n");

        String newDate2 = "4" + "/" + "05" + "/" + "1994";
        System.out.println("newDate2 = " + newDate2);
        System.out.println(newDate2.replace("4" , "00"));
        System.out.printf("\n");

        String newDate3 = "25" + "/" + "08" + "/" + "1992";
        System.out.println("newdate3 = " + newDate3);
        System.out.println("replaceFirst : " +newDate3.replaceFirst("/","-"));
        System.out.println("replaceAll : "+newDate3.replaceAll("/","--"));
        System.out.printf("\n");

        System.out.println("abc\n".repeat(3));
        System.out.println("-".repeat(10));

        System.out.println("abc\n".repeat(3).indent(3));
        System.out.println("-".repeat(10));
    }
}
