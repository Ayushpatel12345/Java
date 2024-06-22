public class ENCAplayerref {
    public static void main(String[] args) {

        ENCAplayer player = new ENCAplayer();

//        player.name = "raj";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("remaing health " + player.healthRemaing());

        ENCAenchedplayer plyer = new ENCAenchedplayer("abc",400,"swd");
        System.out.println("initial health is " + plyer.healthRemaing());
    }
}
