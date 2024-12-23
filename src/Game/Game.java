package Game;

import Color.Color;

public class Game {
    Board board;
    Player[] players;


    public Game(){
        players = new Player[2];
        players[0] = new Player("Mário");
        players[1] = new Player("Inês");

        board = new Board(players);
        chooseWhtPlayer();
        board.addPieces(players[0]);
        board.addPieces(players[1]);
    }

    public void start(){
        winner();
    }

    private void chooseWhtPlayer(){
        int player1Move = players[0].rollTheDice();
        int player2Move = players[1].rollTheDice();
        players[0].setPlayerColor(Color.White);
        players[1].setPlayerColor(Color.Black);

        System.out.println("Let's start!");
        System.out.println(players[0].getName() + " roll " + player1Move + " and " + players[1].getName() + " roll " + player2Move);

        if (player1Move == player2Move) {
            chooseWhtPlayer();
        }

        if (player1Move > player2Move) {
            System.out.println(players[0].getName() + " starts!\n");
        } else {
            System.out.println(players[1].getName() + " starts!\n");
            swapPlayer();
        }
    }

    private void swapPlayer(){
        Player swap = players[0];
        players[0] = players[1];
        players[1] = swap;
    }

    private void winner(){
        if (!players[0].isInCheck()) {
            System.out.println(players[0].getName() + " wins");
        } else {
            System.out.println(players[1].getName() + " wins");
        }
    }
}



