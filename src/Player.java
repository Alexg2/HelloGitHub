public class Player {
    String name;
    static double attackPower = 1;
    static String inventory[] = new String[0];
    static double health= 100; // out of 100

    public static double getHealth() {
        return health;
    }

    public static void setHealth(double health) {
        Player.health = health;
    }

    public String attack(Enemy target){
        target.health = target.health - attackPower;
        return String.format("You dealt %f damage to %s", attackPower, target.name);
    }

    public Player(String name) {
        this.name = name;
    }
}
