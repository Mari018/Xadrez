package Pieces;
import Game.Square;
import Game.Posicion;
import Color.Color;

public abstract class Piece {
    protected Square currPosicion;
    protected Color getColor;
    protected PieceType type;
    protected Posicion posicion;

    public Piece(Color getColor){

        this.getColor = getColor;

    }

    public abstract void move();

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Square square){

        currPosicion = square;
    }

    public Color getColor(){
        return getColor;
    }
}
