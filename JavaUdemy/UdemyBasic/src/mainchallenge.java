public class mainchallenge {

    public static void main(String[] args) {

        calculateScore(true,800,8,200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
