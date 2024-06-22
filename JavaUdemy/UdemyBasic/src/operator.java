public class operator {
    public static void main(String[] args) {

        //less than op(operator)
        int topScore = 100;
        if (topScore > 100) {
            System.out.println("you got top score");
        }
        //less than equal to op
        int lowScore = 100;
        if (lowScore >= 100) {
            System.out.println("you got top score");
        }

        //and operator both true condition
        if (topScore >= 100 || lowScore <= 100) {
            System.out.println("score is ouput");
        }
        //or operator one condition true
        if (topScore >= 100 || lowScore <= 90) {
            System.out.println("score is ouput");
        }

        //ternary op
        int n = 11;
        String number = n % 2 == 0 ? "possitive" : "negative";
        System.out.println(number);

        String hobby = "dancing";
        boolean ishobby = hobby == "swimming" ? true : false;
        System.out.println(ishobby);

        //precedence op
        double first = 20.00d;
        double second = 80.00d;
        double total = (first + second) * 100.00d;
        System.out.println(total);
        double remider = total % 40.00d;
        System.out.println(remider);
        boolean isnoRemider = (remider == 0) ? true : false;
        System.out.println(isnoRemider);
        if (!isnoRemider) {
            System.out.println("got some remider");
        }
    }
}
