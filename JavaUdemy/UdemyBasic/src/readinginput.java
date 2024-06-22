public class readinginput{
    public static void main(String[] args){

        int currentYear = 2022;
        String usersDateofbirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateofbirth);

        System.out.println("age = "+ (currentYear - dateOfBirth));
    }
}