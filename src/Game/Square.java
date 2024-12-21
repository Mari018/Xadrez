package Game;

import Pieces.Piece;

public class Square {
    Posicion posicion;
    Piece currPiece;

    public Square(int col, char row){

        createPosicion(col, row);
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

    public void setCurrPiece(Piece piece){

        currPiece = piece;
        piece.setPosicion(this);
    }

}
