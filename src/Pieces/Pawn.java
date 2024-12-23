package Pieces;

import Color.Color;
import Game.Board;
import Game.Player;
import Game.Posicion;

public class Pawn extends Piece {


    public Pawn(Color getColor) {

        super(getColor);
        this.type = PieceType.PAWN;
    }

    @Override
    public void move(int x, int y, int newX, int newY) {
        x = posicion.getCol();
        y = posicion.getRow();

        if (!board.isEmpty(newX, newY)) {
            if (getMoveCount() == 0) {
                if (getColor() == Color.White) {
                    if (newX == x && newY == y + 2) {
                        board.movePiece(this, newX, newY);
                        addMove();
                    }
                    if (newX == x && newY == y + 1) {
                        board.movePiece(this, newX, newY);
                        addMove();
                    }
                } else {
                    if (newX == x && newY == y + 2) {
                        board.movePiece(this, newX, newY);
                        addMove();
                    }
                    if (newX == x && newY == y + 1) {
                        board.movePiece(this, newX, newY);
                        addMove();
                    }
                }
            } else {
                if (getColor() == Color.White) {
                    if (newX == x && newY == y + 1) {
                        board.movePiece(this, newX, newY);
                        addMove();
                    } else {
                        if (newX == x && newY == y + 1) {
                            board.movePiece(this, newX, newY);
                            addMove();
                        }

                    }
                }

            }
        }
    }
}