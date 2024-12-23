package Pieces;
import Game.Board;
import Game.Square;
import Game.Posicion;
import Color.Color;

public abstract class Piece {
    protected Square currPosicion;
    protected Color getColor;
    protected PieceType type;
    protected Posicion posicion;
    protected int moveCount;
    protected Board board;

    public Piece(Color getColor){

        this.getColor = getColor;

    }

    public abstract void move(int x, int y, int newX, int newY);

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Square square){
        currPosicion = square;
    }

    public Color getColor(){
        return getColor;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public void addMove(){
        moveCount++;
    }

}
