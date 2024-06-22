public class console {
    public static void main(String[] args){

        int currentYear = 2022;
        System.out.println(getInputConsole(currentYear));
    }
    public static String getInputConsole(int currentYear){

        String name = System.console().readLine("hi,whats's your name:");
        System.out.println("hi " + name +", thanks for this course");

        String dateOfBirth = System.console().readLine("where your born:");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "so you are "+ age +" years old";
    }

}
