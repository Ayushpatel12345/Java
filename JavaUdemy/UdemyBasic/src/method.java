public class method {
    public static void main(String[] args) {
       System.out.println("new score is "+ calculateScore("ayu",200));
       System.out.println("new score is "+ calculateScore(10));
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        return calculateScore("ayush",score);
    }
    public static int calculateScore() {

        System.out.println("unnamed player points");
        return 0;
    }
}


