package Pieces;

import Color.Color;

public class King extends Piece {

    public King(Color getColor) {

        super(getColor);
        this.type = PieceType.KING;
    }

    @Override
    public void move(int x, int y, int newX, int newY) {

    }
}
