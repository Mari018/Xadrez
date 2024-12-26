package Pieces;

import Color.Color;

public class King extends Piece {

    public King(Color getColor) {

        super(getColor);
        this.type = PieceType.KING;
    }

    @Override
    public void move(int x, int y, int newX, int newY) {
        x = posicion.getCol();
        y = posicion.getRow();

        if (!board.isEmpty(newX, newY) && board.outOfBoard(newX, newY)) {

            if (newX == x && newY == y + 1) {
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x && newY == y - 1) {
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x - 1 && newY == y) {
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x + 1 && newY == y) {
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x + 1 && newY == y + 1){
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x + 1 && newY == y - 1){
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x - 1 && newY == y + 1){
                board.movePiece(this, newX, newY);
                addMove();
            }

            if (newX == x - 1 && newY == y - 1){
                board.movePiece(this, newX, newY);
                addMove();
            }
        } else {
            System.out.println("Illegal move, try other one.");
        }
    }

}

