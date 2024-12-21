package Game;

import Color.Color;

public class Player {
    private String name;
    private Color playerColor;


    public Player(String name){

        this.name = name;

    }

    public int rollTheDice(int min, int max){
        min = 1;
        max = 6;

        return (int) (Math.random()* (max - min + 1) + min);
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }
}
