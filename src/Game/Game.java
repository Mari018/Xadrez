package Game;

import Color.Color;
import Pieces.King;
import Pieces.Pawn;
import Pieces.Piece;


public class Game {
    private Player[] players;
    private Square[][] board;
    private char[] row = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};


    public Game(Player[] players) {

        this.players = players;
        createBoard();
    }

    private void createBoard() {

        board = new Square[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square(i, row[j]);
            }

        }
    }

    private void addPieces(Player player) {
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


}
