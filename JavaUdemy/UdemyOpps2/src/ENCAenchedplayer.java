public class ENCAenchedplayer {

    private String name;
    private int health;
    private String weapon;

    public ENCAenchedplayer(String name){
        this(name,300,"sword");
    }
    public ENCAenchedplayer(String name,int health,String weapon){
        this.name = name;
        if (health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        }else {
            this.health = health;
        }
        this.weapon = weapon;
    }
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
