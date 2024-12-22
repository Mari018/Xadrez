package Game;

import Color.Color;
import Pieces.Piece;

public class Square {
    private Posicion posicion;
    private Piece currPiece;
    private Color color;

    public Square(int col, char row){

        createPosicion(col, row);
        squareColor();
        currPiece = null;
    }

    public void createPosicion(int col,char row){

        int intRow = 0;

        switch (row){
            case 'a' -> intRow = 0;
            case 'b' -> intRow = 1;
            case 'c' -> intRow = 2;
            case 'd' -> intRow = 3;
            case 'e' -> intRow = 4;
            case 'f' -> intRow = 5;
            case 'g' -> intRow = 6;
            case 'h' -> intRow = 7;
        }

        posicion = new Posicion(col, intRow);
    }

    public void squareColor(){
        int col = posicion.getCol();
        int row = posicion.getRow();

        if((col + row) % 2 == 0 ){
            color = Color.White;
        } else{
            color = Color.Black;
        }

    }

    public void setCurrPiece(Piece piece){

        currPiece = piece;
        piece.setPosicion(this);
    }


    public Piece getCurrPiece() {
        return currPiece;
    }

    public Color getColor(){
        return color;
    }
}
