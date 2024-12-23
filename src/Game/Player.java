package Game;

import Color.Color;

import java.util.ArrayList;

public class Player {
    private String name;
    private Color playerColor;
    private boolean inCheck;
    private ArrayList<String> allMoves;


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

    public void addMove(String move){
        allMoves.add(move);
    }

    public String getName(){
        return name;
    }

    public boolean isInCheck(){
        return inCheck = true;
    }


}
