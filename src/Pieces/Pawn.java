package Pieces;

import Color.Color;

public class Pawn extends Piece {


    public Pawn(Color getColor) {

        super(getColor);
        this.type = PieceType.PAWN;
    }

    @Override
    public void move(int x, int y, int newX, int newY) {

    }
}
