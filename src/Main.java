public class Main {
    public static void main(String[] args){
        String name = IBIO.input("What is your name?");
        Player player = new Player(name);
        Enemy enemy = new Enemy("Robot", 10);
        IBIO.output(String.format("You attack! %s", enemy.name));
        IBIO.output(player.attack(enemy));
    }
}
