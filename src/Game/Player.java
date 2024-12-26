package Game;

import Color.Color;
import Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Color playerColor;
    private boolean inCheck;
    private int move;
    private ArrayList<Piece> capturedPieces = new ArrayList<>();
    private ArrayList<Piece> ownPieces = new ArrayList<>();


    public Player(String name){
        this.name = name;

    }

    public int rollTheDice(){
       int min = 1;
       int max = 6;

        return (int) (Math.random()* (max - min + 1) + min);
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }

    public String getName(){
        return name;
    }

    public int getMove() {
        return move;
    }

    public void addMove(int move){
       this.move += move;
    }

    public boolean isInCheck(){
        return inCheck = true;
    }

    public ArrayList<Piece> getCapturedPieces(){
        return capturedPieces;
    }

    public ArrayList<Piece> getOwnPieces(){
        return ownPieces;
    }



}
