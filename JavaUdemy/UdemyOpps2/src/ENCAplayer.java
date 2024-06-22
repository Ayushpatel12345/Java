public class ENCAplayer {
    public String name;
    public int health;
    public String  weapon;

    public void looseHealth(int demage){

        health = health - demage;
        if (health <= 0){
            System.out.println("player knocked out of game");
        }
    }
    public  int healthRemaing(){return health;}
    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if (health > 100){
            System.out.println("player restore to 100%");
            health = 100;
        }
    }
}
