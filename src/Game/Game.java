package Game;

import Color.Color;
import Pieces.King;
import Pieces.Pawn;
import Pieces.Piece;


public class Game {
    private Player[] players;
    private Square[][] board;
    private char[] row = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private int[] col = {'1' , '2', '3', '4', '5', '6', '7', '8'};


    public Game(Player[] players) {

        this.players = players;

    }

    public void start(){

        chooseWhitePlr();
        createBoard();
        addPieces(players[0]);
        addPieces(players[1]);
        drawBoard();
        winner();
    }

    private void createBoard() {

        board = new Square[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square(i, row[j]);
            }

        }
    }

    public void addPieces(Player player) {
        Color playerColor = player.getPlayerColor();
        Piece piece;

        if (playerColor == Color.White) {
            for (int i = 0; i < 8; i++) {
                piece = new Pawn(Color.White);
                board[1][i].setCurrPiece(piece);
            }

            piece = new King(Color.White);
            board[0][4].setCurrPiece(piece);

        } else {

            if (playerColor == Color.Black) {
                for (int i = 0; i < 8; i++) {
                    piece = new Pawn(Color.Black);
                    board[6][i].setCurrPiece(piece);
                }

                piece = new King(Color.Black);
                board[7][3].setCurrPiece(piece);
            }


        }
    }

    public boolean isEmpty(int x, int y) {

        if (x < 0 || x > 7) {
            return true;
        }

        if (y < 0 || y > 7) {
            return true;
        }

        if (board[x][y].getCurrPiece() == null) {
            return true;
        }

        return false;
    }

    public boolean outOfBoard(int x, int y) {
        if (x < 0 || x > 7) {
            return true;
        }

        if (y < 0 || y > 7) {
            return true;
        }

        return false;
    }

    public Square getSquare(int x, int y) {

        return board[x][y];
    }

    public void drawBoard() {


        for (int i = 7; i < 0; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.println(" " + col[i]);

                Piece piece = board[i][j].getCurrPiece();
                if (piece == null) {
                    if (board[i][j].getColor() == Color.White) {
                        System.out.println("  ");
                    } else {
                        System.out.println("&&");
                    }
                }

                if ((piece instanceof Pawn)) {
                    if (piece.getColor() == Color.White) {
                        System.out.println(" wP");
                    } else {
                        System.out.println(" bP");
                    }

                    if ((piece instanceof King)) {
                        if (piece.getColor() == Color.White) {
                            System.out.println(" wK");
                        } else {
                            System.out.println(" bK");
                        }
                    }
                }
            }
            System.out.println(" " + (i + 1));

        }

        for (int i = 0; i < 8; i++) {
            System.out.println(" " + row[i]);
        }
        System.out.println();
    }

    private void chooseWhitePlr(){
        int player1Move = players[0].rollTheDice();
        int player2Move = players[1].rollTheDice();
        players[0].setPlayerColor(Color.White);
        players[1].setPlayerColor(Color.Black);

        System.out.println("Let's start!");
        System.out.println(players[0].getName() + " roll " + player1Move + " and " + players[1].getName() + " roll " + player2Move);

        if(player1Move == player2Move){
            chooseWhitePlr();
        }

        if(player1Move > player2Move){
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

        if(!players[0].isInCheck()){
            System.out.println(players[0].getName() + " wins");
        } else{
            System.out.println(players[1].getName() + " wins");
        }
    }

}

