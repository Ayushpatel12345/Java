public class codeblock {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelComplete = 20;

        if (score > 1000 && score < 5000) {
            System.out.println("score greater than 1000 and less than 5000");
        } else if (score < 1000) {
            System.out.println("score less than 1000");
        } else {
            System.out.println("got here");
        }

        //second example
        int score1 = 10000;
        int levelcompleted = 8;
        int bonus = 200;

        int finalScore = score1;
        if (gameOver == true) {
            finalScore +=  (levelcompleted * bonus );
            System.out.println(finalScore);
        }
    }
}