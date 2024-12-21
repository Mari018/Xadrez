import Game.Game;
import Game.Player;

public class Main {
    public static void main(String[] args) {

        Player[] players = {new Player("Mário"),
                new Player("Inês")};

        Game game = new Game(players);

    }
}
