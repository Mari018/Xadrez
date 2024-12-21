import Game.Game;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Mário");
        Player player1 = new Player("Inês");

        Game game = new Game(player,player1);
    }
}