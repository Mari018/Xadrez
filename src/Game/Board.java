package Game;

import Color.Color;
import Pieces.King;
import Pieces.Pawn;
import Pieces.Piece;


public class Board {
    private Player[] players;
    private Square[][] board;
    private char[] row = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private int[] col = {1, 2, 3, 4, 5, 6, 7, 8};

    public Board(Player[] players) {

        this.players = players;
        createBoard();
    }

    public void createBoard() {

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


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + col[i] + row[j]);

                Piece piece = board[i][j].getCurrPiece();
                if (piece == null) {
                    if (board[i][j].getColor() == Color.White) {
                        System.out.print("    ");
                    } else {
                        System.out.print(" && ");
                    }
                }

                if ((piece instanceof Pawn)) {
                    if (piece.getColor() == Color.White) {
                        System.out.print(" wP ");
                    } else {
                        System.out.print(" bP ");
                    }
                }

                if ((piece instanceof King)) {
                    if (piece.getColor() == Color.White) {
                        System.out.print(" wK ");
                    } else {
                        System.out.print(" bK ");
                    }
                }

            }
            System.out.println();

        }
        System.out.println();
    }
}

